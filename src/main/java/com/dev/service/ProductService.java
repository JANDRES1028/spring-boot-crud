package com.dev.service;

import com.dev.entity.Product;
import com.dev.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProduct(Integer id) {
        return productRepository.findById(id);

    }

    public Optional<Product> getProductByName(String name) {
        return productRepository.findByName(name);
    }

    public void save(Product product) {
        productRepository.save(product);
    }

    public void delete(Integer id) {
        productRepository.deleteById(id);
    }

    public boolean existsById(Integer id) {
        return productRepository.existsById(id);
    }

    public boolean existsByName(String name) {
        return productRepository.existsByName(name);
    }
}
