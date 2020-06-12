package com.lopamoko.smoke.share;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.Min;

@Data
@Accessors(chain = true)
public class PageParams {
    int skip;
    int limit;
}
