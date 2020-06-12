package com.lopamoko.smoke.product.hookahs.flask;

import com.lopamoko.smoke.product.Color;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Data
@Accessors(chain = true)
@Document(value = "flasks")
public class FlaskEntity {
    @Id
    private String flaskId;
    private String flaskManufacturer;
    private String flaskManufacturerCountry;
    private String flaskName;
    private double flaskHeight;
    private double flaskDiameter;
    private int flaskAmount;
    private String flaskMaterial;
    private Color flaskColor;
    private List<String> flaskImg;
    private BigDecimal flaskPrice;
}
