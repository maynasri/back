package com.example.stockapp.service;

import com.example.stockapp.Repository.ProductRepository;
import com.example.stockapp.entities.Product;
import com.example.stockapp.service.Services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    final private ProductRepository productRepository;



    @Override
    public void createProduct(Product product) {
        this.productRepository.save(product);
    }

    @Override
    public List<Product> getProducts() {
        return this.productRepository.findAll();
    }

    @Override
    public Product getOneProduct(Integer id) {
        return this.productRepository.findById(id).get();
    }

}
