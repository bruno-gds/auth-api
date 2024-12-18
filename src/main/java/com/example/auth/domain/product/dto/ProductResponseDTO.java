package com.example.auth.domain.product.dto;

import com.example.auth.domain.product.Product;

public record ProductResponseDTO(String id, String name, Integer price) {
    public ProductResponseDTO(Product product){
        this(product.getId(), product.getName(), product.getPrice());
    }
}
