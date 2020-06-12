package com.lopamoko.smoke.product.vape.liquid;

import com.lopamoko.smoke.product.ProductEntity;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Data
@Accessors(chain = true)
@Document(value = "liquids")
public class LiquidEntity extends ProductEntity {
    private short nicotine;
    private String proportions;
    private List<Toast> toasts;
    private List<String> shortFacts;
    private int volume;
}
