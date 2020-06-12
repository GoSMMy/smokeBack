package com.lopamoko.smoke.product.vape.accessory.rubber;

import com.lopamoko.smoke.product.Color;
import com.lopamoko.smoke.product.Product;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Rubber extends Product {
    private Color color;
}
