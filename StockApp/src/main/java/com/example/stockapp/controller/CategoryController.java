package com.example.stockapp.controller;

import com.example.stockapp.entities.Category;
import com.example.stockapp.models.CategoryModel;
import com.example.stockapp.service.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    CategoryService categoryService;
    @PostMapping("/categorie")
    void createCategory(@RequestBody CategoryModel model)
    {
        Category category=new Category();
        category.setCategoryName(model.getCategoryName());
        this.categoryService.createCategory(category);
    }
    @GetMapping("/categories")
    public ResponseEntity<?> getCategories() {
        return new ResponseEntity<>(categoryService.findCategories(), HttpStatus.OK);
    }
    @GetMapping("/categories/{id}")
    Category getOneCategory(@PathVariable Integer id)
    {
        return this.categoryService.findOneCategory(id);
    }

}
