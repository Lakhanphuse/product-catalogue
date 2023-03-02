package com.lakhan.product_catalogue.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ChargesDto {


    private double gst;

    @JsonProperty("delivery")
    private  double deliveryCharges;
}
