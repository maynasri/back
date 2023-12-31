package com.example.stockapp.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductModel {
    private String ProductName;
    private String description;
    private Double price;
    private Integer quantity;
    private Integer idCategory;
}
