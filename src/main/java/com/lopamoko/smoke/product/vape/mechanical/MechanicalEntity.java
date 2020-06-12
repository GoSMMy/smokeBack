package com.lopamoko.smoke.product.vape.mechanical;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Data
@Accessors(chain = true)
@Document(value = "mechanicals")
public class MechanicalEntity {
    @Id
    private String mechanicalId;
    private String mechanicalManufacturer;
    private String mechanicalManufacturerCountry;
    private String mechanicalName;
    private int mechanicalAmount;
    private List<String> mechanicalImg;
    private double mechanicalConnector;
    private String mechanicalConnectorType;
    private double mechanicalWeight;
    private List<String> mechanicalEquipment;
    private double mechanicalHeight;
    private double mechanicalWidth;
    private BigDecimal mechanicalPrice;
}
