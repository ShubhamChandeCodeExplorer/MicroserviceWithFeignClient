package com.csi.service;

import com.csi.model.Customer;
import com.csi.repo.CustomerRepo;
import com.csi.vo.OrderDetail;
import com.csi.vo.Product;
import com.csi.vo.RestTemplateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;

@Service
@EnableFeignClients
public class CustomerServiceImpl {
    @Autowired
    private CustomerRepo customerRepoImpl;

    @Autowired
    private OrderDetailClient orderDetailClient;

    @Autowired
    private ProductDetailClient productDetailClient;

    public Customer saveCustomer(Customer customer) {
        return customerRepoImpl.save(customer);
    }

    public RestTemplateVo findBycustId(int custId) {
        RestTemplateVo restTemplateVo=new RestTemplateVo();
        Customer customer=customerRepoImpl.findByCustId(custId);
        OrderDetail orderDetail=orderDetailClient.findbyId(customer.getOrderDetailId());
        Product product=productDetailClient.findByProdId(customer.getProdId());
        restTemplateVo.setOrderDetail(orderDetail);
        restTemplateVo.setProduct(product);
        restTemplateVo.setCustomer(customer);
        return restTemplateVo;
    }
}
