package com.lopamoko.smoke.product.vape.liquid;

import com.lopamoko.smoke.product.Product;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;

@Data
@Accessors(chain = true)
public class Liquid extends Product {
    private short nicotine;
    private String proportions;
    private List<Toast> toasts;
    private List<String> shortFacts;
    private int volume;
}
