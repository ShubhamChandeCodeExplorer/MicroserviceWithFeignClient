package com.csi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallbackcontroller")
public class FallBackController {
    @GetMapping("/customerfallback")
    public ResponseEntity<String> customerFallBack(){
        return ResponseEntity.ok("Customer Service Is Down Please Wait!!!!");
    }

    @GetMapping("/orderfallback")
    public ResponseEntity<String> orderFallBack(){
        return ResponseEntity.ok("Order Service Is Down Please Wait!!!!");
    }

    @GetMapping("/productfallback")
    public ResponseEntity<String> productFallBack(){
        return ResponseEntity.ok("product Service Is Down Please Wait!!!!");
    }



}
