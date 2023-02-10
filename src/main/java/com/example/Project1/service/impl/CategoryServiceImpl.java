package com.example.Project1.service.impl;

import com.example.Project1.model.Category;
import com.example.Project1.repository.CategoryRepository;
import com.example.Project1.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public void add(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void update(Long id, Category category) {
        Category myCategory = categoryRepository.findById(id).get();
        myCategory.setName(category.getName());
        myCategory.setSubcategories(category.getSubcategories());
        categoryRepository.save(myCategory);
    }

    @Override
    public void delete(Long id) {
        Optional<Category> optional = categoryRepository.findById(id);

        if (optional.isPresent()){
            categoryRepository.delete(optional.get());
        }

    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }
}













