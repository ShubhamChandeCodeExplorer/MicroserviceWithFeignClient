package com.csi.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {
    private int orderDetailId;
    private String orderDetailDescription;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date orderDetailDate;
}
