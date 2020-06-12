package com.lopamoko.smoke.product.hookahs.hose;

import com.lopamoko.smoke.product.Color;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;

@Data
@Accessors(chain = true)
public class Hose {
    private String hoseId;
    private String hoseManufacturer;
    private String hoseManufacturerCountry;
    private String hoseName;
    private double hoseWidth;
    private int hoseAmount;
    private Color hoseColor;
    private String hoseMaterial;
    private List<String> hoseImg;
    private BigDecimal hosePrice;
}
