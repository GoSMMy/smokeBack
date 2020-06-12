package com.lopamoko.smoke.product.vape.component.glycerol;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Data
@Accessors(chain = true)
@Document(value = "glycerols")
public class GlycerolEntity {
    @Id
    private String glycerolId;
    private String glycerolManufacturer;
    private String glycerolManufacturerCountry;
    private String glycerolName;
    private int glycerolVolume;
    private int glycerolAmount;
    private List<String> glycerolImg;
    private BigDecimal glycerolPrice;
}
