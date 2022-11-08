package org.sid.msvault;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RefreshScope
public class ConfigTestRestController {
    @Autowired
    private MyVaultSecretConfig myVaultSecretConfig;
    @Autowired
    private MyConsulConfig myConfig;

    @GetMapping("/config")
    public Map<String, Object> getConfig(){
        return Map.of("vault.user",myVaultSecretConfig,"consul.token", myConfig);
    }
}
