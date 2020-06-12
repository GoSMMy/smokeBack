package com.lopamoko.smoke.product.hookahs.mouthpiece;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class MouthpieceToMouthpieceEntityConverter implements Converter<Mouthpiece, MouthpieceEntity> {
    @Override
    @NonNull
    public MouthpieceEntity convert(Mouthpiece mouthpiece) {
        return new MouthpieceEntity()
                .setMouthpieceId(mouthpiece.getMouthpieceId())
                .setMouthpieceManufacturer(mouthpiece.getMouthpieceManufacturer())
                .setMouthpieceManufacturerCountry(mouthpiece.getMouthpieceManufacturerCountry())
                .setMouthpieceName(mouthpiece.getMouthpieceName())
                .setMouthpieceAmount(mouthpiece.getMouthpieceAmount())
                .setMouthpieceMaterial(mouthpiece.getMouthpieceMaterial())
                .setMouthpieceColor(mouthpiece.getMouthpieceColor())
                .setMouthpieceImg(mouthpiece.getMouthpieceImg())
                .setMouthpiecePrice(mouthpiece.getMouthpiecePrice());
    }
}
