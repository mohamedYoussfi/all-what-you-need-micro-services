package org.sid.consulconfigservicetest;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Data
public class Credentials {
    private String username;
    private String password;
}
