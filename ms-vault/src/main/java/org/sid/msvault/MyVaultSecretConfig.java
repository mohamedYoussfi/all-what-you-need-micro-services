package org.sid.msvault;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("user")
@Data
public class MyVaultSecretConfig {
    private String username;
    private String password;
}
