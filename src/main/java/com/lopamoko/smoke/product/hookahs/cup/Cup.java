package com.lopamoko.smoke.product.hookahs.cup;


import com.lopamoko.smoke.product.Color;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;

@Data
@Accessors(chain = true)
public class Cup {
    private String cupId;
    private String cupManufacturer;
    private String cupManufacturerCountry;
    private String cupName;
    private double cupHeight;
    private double cupDiameter;
    private int cupAmount;
    private List<String> cupImg;
    private String cupMaterial;
    private Color cupColor;
    private BigDecimal cupPrice;
}
