package com.example.Project1.service;


import com.example.Project1.model.Subcategory;

import java.util.List;

public interface SubcategoryService {

    List<Subcategory> getAllSubcategories();

    void add(Subcategory subcategory);

    void update(Long id, Subcategory subcategory);

    void delete(Long id);

    Subcategory getSubcategoryById(Long id);
}
