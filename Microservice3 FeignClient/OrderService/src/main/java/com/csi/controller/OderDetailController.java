package com.csi.controller;

import com.csi.model.OrderDetail;
import com.csi.service.OrderDetailService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import javax.validation.Valid;
import javax.ws.rs.Path;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OderDetailController {
    @Autowired
    private OrderDetailService orderDetailServiceImpl;

    @PostMapping("/saveorderdetails")
    public ResponseEntity<OrderDetail> saveOrder(@Valid @RequestBody OrderDetail orderDetail){
        return new ResponseEntity<>(orderDetailServiceImpl.saveOrderDetail(orderDetail), HttpStatus.CREATED);
    }

    @GetMapping("/findbyid/{orderDetailId}")
    public ResponseEntity<Optional<OrderDetail>> findbyid(@PathVariable int orderDetailId){
        return ResponseEntity.ok(orderDetailServiceImpl.findByOrderDetailId(orderDetailId));
    }

}
