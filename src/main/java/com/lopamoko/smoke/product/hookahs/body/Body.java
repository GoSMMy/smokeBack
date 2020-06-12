package com.lopamoko.smoke.product.hookahs.body;

import com.lopamoko.smoke.product.Color;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;

@Data
@Accessors(chain = true)
public class Body {
    private String bodyId;
    private String bodyManufacturer;
    private String bodyManufacturerCountry;
    private String bodyName;
    private double bodyHeight;
    private double bodyDiameter;
    private int bodyAmount;
    private List<String> bodyImg;
    private Color bodyColor;
    private BigDecimal bodyPrice;
}
