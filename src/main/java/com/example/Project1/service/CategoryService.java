package com.example.Project1.service;

import com.example.Project1.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAllCategories();

    void add(Category category);

    void update(Long id, Category category);

    void delete(Long id);

    Category getCategoryById(Long id);
}
