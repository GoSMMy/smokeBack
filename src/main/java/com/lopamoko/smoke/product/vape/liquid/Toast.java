package com.lopamoko.smoke.product.vape.liquid;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Toast {
    private String name;
    private String img;
}
