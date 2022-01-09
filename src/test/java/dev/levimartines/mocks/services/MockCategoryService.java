package dev.levimartines.mocks.services;

import dev.levimartines.exceptions.ObjectNotFoundException;
import dev.levimartines.models.entities.Category;
import dev.levimartines.models.entities.Product;
import dev.levimartines.models.vo.CategoryVO;
import dev.levimartines.services.CategoryService;
import io.quarkus.test.Mock;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

@Mock
@ApplicationScoped
public class MockCategoryService extends CategoryService {

    @Override
    public List<Category> findAll() {
        return List.of(
            Category.builder().id(1L).name("Clothes").build(),
            Category.builder().id(2L).name("Beverage").build()
        );
    }

    @Override
    public Category save(CategoryVO vo) {
        return Category.builder().id(1L).name(vo.getName()).build();
    }

    @Override
    public Category findById(Long id) {
        if (id != 1L) {
            throw new ObjectNotFoundException();
        }
        List<Product> products = List.of(Product.builder().id(1L).name("Test Product 1").build(),
            Product.builder().id(2L).name("Test Product 2").build());
        return Category.builder().id(id).name("Test Category").products(products).build();
    }
}
