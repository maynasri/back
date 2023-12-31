package com.example.stockapp.service.Services;

import com.example.stockapp.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    void createProduct(Product product);
    List<Product> getProducts();
    Product getOneProduct(Integer id);
}
