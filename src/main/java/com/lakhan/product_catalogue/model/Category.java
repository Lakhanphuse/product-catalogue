package com.lakhan.product_catalogue.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int productCategoryId;

    private String productCategory;

    private double discount;

    private double gst;

    private double deliveryCharge;

}
