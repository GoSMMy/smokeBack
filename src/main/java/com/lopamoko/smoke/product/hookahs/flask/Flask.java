package com.lopamoko.smoke.product.hookahs.flask;

import com.lopamoko.smoke.product.Color;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;

@Data
@Accessors(chain = true)
public class Flask {
    private String flaskId;
    private String flaskManufacturer;
    private String flaskManufacturerCountry;
    private String flaskName;
    private double flaskHeight;
    private double flaskDiameter;
    private int flaskAmount;
    private Color flaskColor;
    private String flaskMaterial;
    private List<String> flaskImg;
    private BigDecimal flaskPrice;
}
