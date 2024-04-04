package com.csi.controller;

import com.csi.model.Customer;
import com.csi.service.CustomerServiceImpl;
import com.csi.vo.RestTemplateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerServiceImpl customerServiceImpl;
    @PostMapping("/savecustomer")
    public ResponseEntity<Customer> saveCustomerDate(@Valid @RequestBody Customer customer){
        return new ResponseEntity<>(customerServiceImpl.saveCustomer(customer), HttpStatus.CREATED);
    }

    @GetMapping("/findbycustid/{custId}")
    public ResponseEntity<RestTemplateVo> findBycustId(@PathVariable int custId){
        return ResponseEntity.ok(customerServiceImpl.findBycustId(custId));
    }
}
