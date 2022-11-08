package org.sid.msvault;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("token")
@Data
public class MyConsulConfig {
    private long timeout;
    private String authHeader;
}
