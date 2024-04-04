package com.csi.service;

import com.csi.model.OrderDetail;
import com.csi.repo.OrderDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderDetailService {
    @Autowired
    private OrderDetailRepo orderDetailRepoImpl;

    public OrderDetail saveOrderDetail(OrderDetail orderDetail) {
        return orderDetailRepoImpl.save(orderDetail);
    }

    public Optional<OrderDetail> findByOrderDetailId(int orderDetailId) {
        return orderDetailRepoImpl.findById(orderDetailId);
    }
}
