package dev.levimartines.mappers;

import dev.levimartines.models.dto.CategoryDTO;
import dev.levimartines.models.entities.Category;
import dev.levimartines.models.vo.CategoryVO;

public class CategoryMapper {

    public static Category toEntity(CategoryVO vo) {
        return Category.builder()
            .name(vo.getName())
            .build();
    }

    public static CategoryDTO toDTO(Category category) {
        return CategoryDTO.builder()
            .id(category.getId())
            .name(category.getName())
            .build();
    }
}
