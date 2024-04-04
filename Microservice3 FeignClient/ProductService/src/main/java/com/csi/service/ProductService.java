package com.csi.service;

import com.csi.model.Product;
import com.csi.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepoImpl;

    public Product saveProduct(Product product) {
        return productRepoImpl.save(product);
    }

    public Optional<Product> findByProductId(int prodId) {
        return productRepoImpl.findById(prodId);
    }
}
