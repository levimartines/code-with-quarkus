package dev.levimartines.mocks.services;

import dev.levimartines.models.entities.Category;
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
        return List.of(new Category(1L, "Clothes"), new Category(2L, "Drinks"));
    }

    @Override
    public Category save(CategoryVO vo) {
        return new Category(1L, vo.getName());
    }
}
