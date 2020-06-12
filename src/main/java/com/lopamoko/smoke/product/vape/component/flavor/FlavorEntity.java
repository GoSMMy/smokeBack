package com.lopamoko.smoke.product.vape.component.flavor;

import com.lopamoko.smoke.product.vape.liquid.Toast;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Data
@Accessors(chain = true)
@Document(value = "flavors")
public class FlavorEntity {
    @Id
    private String flavorId;
    private String flavorManufacturer;
    private String flavorManufacturerCountry;
    private String flavorName;
    private List<Toast> flavorToast;
    private List<String> flavorImg;
    private int flavorAmount;
    private short flavorNicotine;
    private int flavorVolume;
    private BigDecimal flavorPrice;
}
