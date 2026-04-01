package com.example.train;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    // 1️⃣ GET /products
    @GetMapping
    public List<ProductEntity> getAllProducts() {
        return service.getAllProducts();
    }

    // 2️⃣ POST /products
    @PostMapping
    public ProductEntity createProduct(@RequestBody ProductEntity product) {
        return service.addProduct(product);
    }
}
