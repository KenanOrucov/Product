//package com.example.Project1.controller;
//
//import com.example.Project1.dto.request.SubcategoryRequest;
//import com.example.Project1.dto.response.SubcategoryResponse;
//import com.example.Project1.mapper.SubcategoryMapper;
//import com.example.Project1.service.SubcategoryService;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/subcategory")
//public class SubcategoryController {
//
//    private final SubcategoryMapper subcategoryMapper = SubcategoryMapper.INSTANCE;
//    private final SubcategoryService subcategoryService;
//
//    public SubcategoryController(SubcategoryService subcategoryService) {
//        this.subcategoryService = subcategoryService;
//    }
//
//    @GetMapping()
//    public List<SubcategoryResponse> getAllSubcategory(){
//        return subcategoryMapper.toSubcategoryResponseList(subcategoryService.getAllSubcategories());
//    }
//
//    @GetMapping("/{id}")
//    public SubcategoryResponse getSubcategoryById(@PathVariable Long id){
//        return subcategoryMapper.toSubcategoryResponse(subcategoryService.getSubcategoryById(id));
//    }
//
//    @PostMapping
//    public ResponseEntity<Void> createSubCategory(@RequestBody SubcategoryRequest subcategoryRequest){
//        subcategoryService.add(subcategoryMapper.toSubcategory(subcategoryRequest));
//        return ResponseEntity.ok().build();
//    }
//
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Void> updateSubCategory(@RequestBody SubcategoryRequest subcategoryRequest, @PathVariable Long id){
//        subcategoryService.update(id, subcategoryMapper.toSubcategory(subcategoryRequest));
//        return ResponseEntity.ok().build();
//    }
//
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteSubCategory(@PathVariable Long id){
//        subcategoryService.delete(id);
//        return ResponseEntity.ok().build();
//    }
//}
