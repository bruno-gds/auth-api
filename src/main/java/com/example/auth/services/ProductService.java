package com.example.auth.services;

import com.example.auth.domain.product.Product;
import com.example.auth.domain.product.dto.ProductRequestDTO;
import com.example.auth.domain.product.dto.ProductResponseDTO;
import com.example.auth.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repository;

    ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public void create(ProductRequestDTO product) {
        Product newProduct = new Product(product);

        this.repository.save(newProduct);
    }

    public List<ProductResponseDTO> findAll() {
        return this.repository.findAll().stream().map(ProductResponseDTO::new).toList();
    }
}
