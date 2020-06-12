package com.lopamoko.smoke.product.hookahs.mouthpiece;

import com.lopamoko.smoke.product.Color;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Data
@Accessors(chain = true)
@Document(value = "mouthpieces")
public class MouthpieceEntity {
    @Id
    private String mouthpieceId;
    private String mouthpieceManufacturer;
    private String mouthpieceManufacturerCountry;
    private String mouthpieceName;
    private String mouthpieceAmount;
    private String mouthpieceMaterial;
    private Color mouthpieceColor;
    private List<String> mouthpieceImg;
    private BigDecimal mouthpiecePrice;
}
