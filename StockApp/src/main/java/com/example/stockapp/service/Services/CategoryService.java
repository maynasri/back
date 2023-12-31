package com.example.stockapp.service.Services;

import com.example.stockapp.entities.Category;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {
    void createCategory(Category category);
    List<Category> findCategories();
    Category findOneCategory(Integer id);
}
