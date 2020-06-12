package com.lopamoko.smoke.product;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;

@Data
@Accessors(chain = true)
public abstract class Product {
    private String id;
    private String manufacturer;
    private String manufacturerCountry;
    private String name;
    private List<String> images;
    private int amount;
    private BigDecimal price;
}