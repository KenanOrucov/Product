package com.example.Project1.dto.response;


import java.util.List;

public class CategoryResponse {

    private Long id;
    private String name;
//    private List<Subcategory> subcategories;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<Subcategory> getSubcategories() {
//        return subcategories;
//    }

//    public void setSubcategories(List<Subcategory> subcategories) {
//        this.subcategories = subcategories;
//    }
}
