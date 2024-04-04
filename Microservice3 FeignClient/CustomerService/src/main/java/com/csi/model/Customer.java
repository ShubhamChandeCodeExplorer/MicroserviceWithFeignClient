package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMER")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int custId;
    private String custName;
    private long custContact;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date custDOB;
    private String custEmailId;
    private String custPassword;
    private int prodId;
    private int orderDetailId;
}
