package com.lopamoko.smoke.product.vape.atomizer;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class AtomizerRequest {
    private int skip;
    private int limit;
}
