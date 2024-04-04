package com.csi.service;

import com.csi.vo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:9192",value = "ProductService")
public interface ProductDetailClient {
    @GetMapping("/products/findbyprodid/{prodId}")
    public Product findByProdId(@PathVariable int prodId);
}
