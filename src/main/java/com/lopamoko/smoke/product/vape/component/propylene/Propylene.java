package com.lopamoko.smoke.product.vape.component.propylene;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;

@Data
@Accessors(chain = true)
public class Propylene {
    private String propyleneId;
    private String propyleneManufacturer;
    private String propyleneManufacturerCountry;
    private String propyleneName;
    private int propyleneVolume;
    private int propyleneAmount;
    private List<String> propyleneImg;
    private BigDecimal propylenePrice;
}

