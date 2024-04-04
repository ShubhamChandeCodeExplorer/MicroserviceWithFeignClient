package com.csi.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int prodId;
    private String prodName;
    private double prodPrice;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date prodLaunchDate;
}
