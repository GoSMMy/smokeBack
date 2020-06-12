package com.lopamoko.smoke.product.hookahs.mouthpiece;

import com.lopamoko.smoke.product.Color;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;

@Data
@Accessors(chain = true)
public class Mouthpiece {
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
