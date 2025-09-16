package com.example.backoffice.service;

import com.example.backoffice.model.Product;
import com.example.backoffice.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> findAll() { return repository.findAll(); }
    public Product findById(Long id) { return repository.findById(id).orElse(null); }
    public Product save(Product product) { return repository.save(product); }
    public void delete(Long id) { repository.deleteById(id); }
}
