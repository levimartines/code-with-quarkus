package dev.levimartines.services;

import dev.levimartines.mappers.CategoryMapper;
import dev.levimartines.models.entities.Category;
import dev.levimartines.models.vo.CategoryVO;
import dev.levimartines.repositories.CategoryRepository;

import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
@Slf4j
public class CategoryService {

    @Inject
    CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll().stream().collect(Collectors.toList());
    }

    @Transactional
    public Category save(CategoryVO categoryVO) {
        Category category = CategoryMapper.toEntity(categoryVO);
        category.persist();
        return category;
    }
}
