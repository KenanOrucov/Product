package com.example.Project1.controller;

import com.example.Project1.dto.request.CategoryRequest;
import com.example.Project1.dto.response.CategoryResponse;
import com.example.Project1.mapper.CategoryMapper;
import com.example.Project1.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryMapper categoryMapper = CategoryMapper.INSTANCE;
    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping()
    public List<CategoryResponse> getAllCategories(){
        return categoryMapper.toCategoryResponseList(categoryService.getAllCategories());
    }

    @GetMapping("/{id}")
    public CategoryResponse getCategoryById(@PathVariable Long id){
        return categoryMapper.toCategoryResponse(categoryService.getCategoryById(id));
    }

    @PostMapping()
    public ResponseEntity<Void> createCategory(@RequestBody CategoryRequest categoryRequest){
        categoryService.add(categoryMapper.toCategory(categoryRequest));
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateCategory(@RequestBody CategoryRequest categoryRequest, @PathVariable Long id){
        categoryService.update(id, categoryMapper.toCategory(categoryRequest));

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id){
        categoryService.delete(id);
        return ResponseEntity.ok().build();
    }

}
