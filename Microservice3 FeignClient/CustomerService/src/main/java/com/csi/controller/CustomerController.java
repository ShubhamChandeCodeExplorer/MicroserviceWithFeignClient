package com.csi.controller;

import com.csi.model.Customer;
import com.csi.service.CustomerServiceImpl;
import com.csi.vo.RestTemplateVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/customers")
@Slf4j
public class CustomerController {
    @Autowired
    private CustomerServiceImpl customerServiceImpl;
    @PostMapping("/savecustomer")
    public ResponseEntity<Customer> saveCustomerDate(@Valid @RequestBody Customer customer){
        log.info("SAVE TO CUSTOME DATA FOR "+customer.getCustName());
        return new ResponseEntity<>(customerServiceImpl.saveCustomer(customer), HttpStatus.CREATED);
    }

    @GetMapping("/findbycustid/{custId}")
    public ResponseEntity<RestTemplateVo> findBycustId(@PathVariable int custId){
        log.info("Find THE DATA ON THE BASIS OF ID ");
        return ResponseEntity.ok(customerServiceImpl.findBycustId(custId));
    }

}
