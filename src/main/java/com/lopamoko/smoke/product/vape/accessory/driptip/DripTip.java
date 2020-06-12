package com.lopamoko.smoke.product.vape.accessory.driptip;

import com.lopamoko.smoke.product.Color;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;

@Data
@Accessors(chain = true)
public class DripTip {
    private String dripTipId;
    private String dripTipManufacturer;
    private String dripTipManufacturerCountry;
    private String dripTipName;
    private Color dripTipColor;
    private int dripTipAmount;
    private String dripTipMaterial;
    private List<String> dripTipImg;
    private BigDecimal dripTipPrice;
}
