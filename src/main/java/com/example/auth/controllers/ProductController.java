package com.example.auth.controllers;

import com.example.auth.domain.product.dto.ProductRequestDTO;
import com.example.auth.domain.product.dto.ProductResponseDTO;
import com.example.auth.services.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("product")
public class ProductController {
    private final ProductService productService;

    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void postProduct(@RequestBody @Valid ProductRequestDTO body) {
        this.productService.create(body);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponseDTO> getAllProducts() {
        return this.productService.findAll();
    }
}
