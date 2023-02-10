package com.example.Project1.service.impl;


import com.example.Project1.model.Subcategory;
import com.example.Project1.repository.SubcategoryRepository;
import com.example.Project1.service.SubcategoryService;

import java.util.List;
import java.util.Optional;

public class SubcategoryServiceImpl implements SubcategoryService {

    private SubcategoryRepository subcategoryRepository;

    public SubcategoryServiceImpl(SubcategoryRepository subcategoryRepository) {
        this.subcategoryRepository = subcategoryRepository;
    }

    @Override
    public List<Subcategory> getAllSubcategories() {
        return subcategoryRepository.findAll();
    }

    @Override
    public void add(Subcategory subcategory) {
        subcategoryRepository.save(subcategory);
    }

    @Override
    public void update(Long id, Subcategory subcategory) {
        Subcategory mySubcategory = subcategoryRepository.findById(id).get();
        mySubcategory.setName(subcategory.getName());
//        mySubcategory.setProducts(subcategory.getProducts());
        subcategoryRepository.save(mySubcategory);
    }

    @Override
    public void delete(Long id) {
        Optional<Subcategory> optional = subcategoryRepository.findById(id);

        if (optional.isPresent()){
            subcategoryRepository.delete(optional.get());
        }
    }

    @Override
    public Subcategory getSubcategoryById(Long id) {
        return subcategoryRepository.findById(id).orElse(null);
    }
}
