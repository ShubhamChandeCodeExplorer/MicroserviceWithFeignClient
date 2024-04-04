package com.csi.service;

import com.csi.vo.OrderDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:9191",value = "OrderService")
public interface OrderDetailClient {
    @GetMapping("/orders/findbyid/{orderDetailId}")
    public OrderDetail findbyId(@PathVariable int orderDetailId);
}
