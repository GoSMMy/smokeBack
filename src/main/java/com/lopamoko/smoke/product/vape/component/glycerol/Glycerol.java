package com.lopamoko.smoke.product.vape.component.glycerol;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;

@Data
@Accessors(chain = true)
public class Glycerol {
    private String glycerolId;
    private String glycerolManufacturer;
    private String glycerolManufacturerCountry;
    private String glycerolName;
    private int glycerolVolume;
    private int glycerolAmount;
    private List<String> glycerolImg;
    private BigDecimal glycerolPrice;
}
