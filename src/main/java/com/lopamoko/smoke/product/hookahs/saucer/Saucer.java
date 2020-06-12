package com.lopamoko.smoke.product.hookahs.saucer;

import com.lopamoko.smoke.product.Color;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;

@Data
@Accessors(chain = true)
public class Saucer {
    private String saucerId;
    private String saucerManufacturer;
    private String saucerManufacturerCountry;
    private String saucerName;
    private double saucerWidth;
    private double saucerDiameter;
    private int saucerAmount;
    private List<String> saucerImg;
    private String saucerMaterial;
    private Color saucerColor;
    private BigDecimal saucerPrice;
}
