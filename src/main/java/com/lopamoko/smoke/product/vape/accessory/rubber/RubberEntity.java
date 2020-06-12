package com.lopamoko.smoke.product.vape.accessory.rubber;

import com.lopamoko.smoke.product.Color;
import com.lopamoko.smoke.product.ProductEntity;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Accessors(chain = true)
@Document(collection = "rubbers")
public class RubberEntity extends ProductEntity {
    private Color color;
}
