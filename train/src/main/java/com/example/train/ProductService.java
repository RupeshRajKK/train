package com.example.train;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<ProductEntity> getAllProducts() {
        return repository.findAll();
    }

    public ProductEntity addProduct(ProductEntity product) {
        return repository.save(product);
    }
}
