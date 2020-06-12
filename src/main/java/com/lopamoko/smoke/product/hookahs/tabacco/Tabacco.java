package com.lopamoko.smoke.product.hookahs.tabacco;

import com.lopamoko.smoke.product.Resistance;
import com.lopamoko.smoke.product.Strength;
import com.lopamoko.smoke.product.vape.liquid.Toast;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;

@Data
@Accessors(chain = true)
public class Tabacco {
    private String tabaccoId;
    private String tabaccoManufacturer;
    private String tabaccoManufacturerCountry;
    private String tabaccoName;
    private List<Toast> tabaccoToasts;
    private Resistance tabaccoResistance;
    private Strength tabaccoStrength;
    private List<String> tabaccoImg;
    private int tabaccoAmount;
    private int tabaccoWeight;
    private BigDecimal tabaccoPrice;
}
