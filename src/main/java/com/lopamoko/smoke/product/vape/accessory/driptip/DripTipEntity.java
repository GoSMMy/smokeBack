package com.lopamoko.smoke.product.vape.accessory.driptip;

import com.lopamoko.smoke.product.Color;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Data
@Accessors(chain = true)
@Document(collection = "dripTips")
public class DripTipEntity {
    @Id
    private String dripTipId;
    private String dripTipManufacturer;
    private String dripTipManufacturerCountry;
    private String dripTipName;
    private int dripTipAmount;
    private String dripTipMaterial;
    private List<String> dripTipImg;
    private Color dripTipColor;
    private BigDecimal dripTipPrice;
}
