package com.example.Project1.mapper;


import com.example.Project1.dto.request.SubcategoryRequest;
import com.example.Project1.dto.response.SubcategoryResponse;
import com.example.Project1.model.Subcategory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SubcategoryMapper {

    SubcategoryMapper INSTANCE = Mappers.getMapper(SubcategoryMapper.class);


    SubcategoryResponse toSubcategoryResponse(Subcategory subcategory);

    List<SubcategoryResponse> toSubcategoryResponseList(List<Subcategory> subcategories);

    Subcategory toSubcategory(SubcategoryRequest subcategoryRequest);
}
