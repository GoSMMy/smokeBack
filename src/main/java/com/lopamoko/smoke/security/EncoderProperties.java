package com.lopamoko.smoke.security;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Accessors(chain = true)
@Configuration
@ConfigurationProperties(prefix = "encoder")
public class EncoderProperties {
    private String secret;
    private int iteration;
    private int keyLength;
}
