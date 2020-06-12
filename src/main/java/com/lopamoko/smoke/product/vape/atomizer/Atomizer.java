package com.lopamoko.smoke.product.vape.atomizer;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;

@Data
@Accessors(chain = true)
public class Atomizer {
    private String id;
    private double resistance;
    private String body;
    private String wick;
    private BigDecimal price;
    private int count;
    private List<String> shortFacts;
}
