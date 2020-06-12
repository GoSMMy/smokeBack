package com.lopamoko.smoke.product.vape.liquid;

import com.lopamoko.smoke.share.PageParams;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.Min;


@Data
@NoArgsConstructor
@Accessors(chain = true)
public class LiquidRequest extends PageParams {
}
