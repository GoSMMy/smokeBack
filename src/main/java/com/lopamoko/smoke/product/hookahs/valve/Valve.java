package com.lopamoko.smoke.product.hookahs.valve;

import com.lopamoko.smoke.product.Color;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;

@Data
@Accessors(chain = true)
public class Valve {
    private String valveId;
    private String valveManufacturer;
    private String valveManufacturerCountry;
    private String valveName;
    private Color valveColor;
    private String valveMaterial;
    private List<String> valveImg;
    private int valveAmount;
    private BigDecimal valvePrice;
}
