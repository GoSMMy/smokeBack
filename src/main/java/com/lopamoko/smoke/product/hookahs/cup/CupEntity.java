package com.lopamoko.smoke.product.hookahs.cup;

import com.lopamoko.smoke.product.Color;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Data
@Accessors(chain = true)
@Document(value = "cups")
public class CupEntity {
    @Id
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
