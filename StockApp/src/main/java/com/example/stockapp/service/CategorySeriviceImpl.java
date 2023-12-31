package com.example.stockapp.service;

import com.example.stockapp.Repository.CategoryRepository;
import com.example.stockapp.entities.Category;
import com.example.stockapp.service.Services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class CategorySeriviceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    @Autowired
    public CategorySeriviceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void createCategory(Category category) {
        this.categoryRepository.save(category);

    }

    @Override
    public List<Category> findCategories() {
        return this.categoryRepository.findAll()
                ;	}

    @Override
    public Category findOneCategory(Integer id) {
        return this.categoryRepository.findById(id).get();
    }

}
