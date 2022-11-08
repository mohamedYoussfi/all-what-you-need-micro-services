package org.sid.consulconfigservicetest;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix = "token")
@Data
public class AppConfig {
    public long accessTokenTimeout;
    public long refreshTokenTimeout;
    public String headerToken;
}
