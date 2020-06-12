package com.lopamoko.smoke.product.vape.liquid;

import com.lopamoko.smoke.share.ApplicationException;

public class LiquidNotFoundException extends ApplicationException {

    public LiquidNotFoundException(String liquidId) {
        super("Can't find liquid by id " + liquidId);
    }
}
