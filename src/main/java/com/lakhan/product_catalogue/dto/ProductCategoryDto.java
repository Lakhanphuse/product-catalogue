package com.lakhan.product_catalogue.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonPropertyOrder({ "productId", "name", "productType" ,"category" , "basePrice", "discount", "charges", "finalPrice" })
public class ProductCategoryDto {

    private int productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("productType")
    private String productType;

    @JsonProperty("category")
    private String productCategory;

    @JsonProperty("basePrice")
    private double productPrice;

    @JsonProperty("discount")
    private double discount;

    private ChargesDto charges;

    private double finalPrice;

}
