package com.csi.controller;

import com.csi.model.Product;
import com.csi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productServiceImpl;

    @PostMapping("/saveproduct")
    public ResponseEntity<Product> saveProduct(@Valid @RequestBody Product product){
        return new ResponseEntity<>(productServiceImpl.saveProduct(product), HttpStatus.CREATED);
    }

    @GetMapping("/findbyprodid/{prodId}")
    public ResponseEntity<Optional<Product>> findByProductId(@PathVariable int prodId){
        return ResponseEntity.ok(productServiceImpl.findByProductId(prodId));
    }


}
