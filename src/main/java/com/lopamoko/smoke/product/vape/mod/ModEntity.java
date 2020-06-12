package com.lopamoko.smoke.product.vape.mod;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Accessors(chain = true)
@Document(value = "mods")
public class ModEntity {
    @Id
    private String id;
    private String name;
    private String manufacturer;
    private int batteriesCnt;
    private String batteriesType;
    private List<String> shortFacts;
}
