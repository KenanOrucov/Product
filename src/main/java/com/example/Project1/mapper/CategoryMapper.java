package com.example.Project1.mapper;


import com.example.Project1.dto.request.CategoryRequest;
import com.example.Project1.dto.response.CategoryResponse;
import com.example.Project1.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


import java.util.List;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);


    CategoryResponse toCategoryResponse(Category category);

    List<CategoryResponse> toCategoryResponseList(List<Category> categories);

    Category toCategory(CategoryRequest categoryRequest);
}
