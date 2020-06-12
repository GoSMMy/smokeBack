package com.lopamoko.smoke.product.vape.mechanical;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;

@Data
@Accessors(chain = true)
public class Mechanical {
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
