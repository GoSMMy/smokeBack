package com.lopamoko.smoke.product.vape.atomizer;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;


@Data
@Accessors(chain = true)
@Document(value = "atomizers")
public class AtomizerEntity {
    @Id
    private String id;
    private double resistance;
    private String body;
    private String wick;
    private BigDecimal price;
    private int count;
    private List<String> shortFacts;
}
