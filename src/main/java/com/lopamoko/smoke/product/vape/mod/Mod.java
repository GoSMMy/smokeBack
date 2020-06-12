package com.lopamoko.smoke.product.vape.mod;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Mod {
    private String id;
    private String name;
    private String manufacturer;
    private int batteriesCnt;
    private String batteriesType;
    private List<String> shortFacts;
}
