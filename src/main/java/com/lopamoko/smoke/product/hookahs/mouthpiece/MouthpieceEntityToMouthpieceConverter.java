package com.lopamoko.smoke.product.hookahs.mouthpiece;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class MouthpieceEntityToMouthpieceConverter implements Converter<MouthpieceEntity, Mouthpiece> {
    @Override
    @NonNull
    public Mouthpiece convert(MouthpieceEntity mouthpieceEntity) {
        return new Mouthpiece()
                .setMouthpieceId(mouthpieceEntity.getMouthpieceId())
                .setMouthpieceManufacturer(mouthpieceEntity.getMouthpieceManufacturer())
                .setMouthpieceManufacturerCountry(mouthpieceEntity.getMouthpieceManufacturerCountry())
                .setMouthpieceName(mouthpieceEntity.getMouthpieceName())
                .setMouthpieceAmount(mouthpieceEntity.getMouthpieceAmount())
                .setMouthpieceMaterial(mouthpieceEntity.getMouthpieceMaterial())
                .setMouthpieceColor(mouthpieceEntity.getMouthpieceColor())
                .setMouthpieceImg(mouthpieceEntity.getMouthpieceImg())
                .setMouthpiecePrice(mouthpieceEntity.getMouthpiecePrice());
    }
}
