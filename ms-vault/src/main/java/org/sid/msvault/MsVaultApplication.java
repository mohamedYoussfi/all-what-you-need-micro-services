package org.sid.msvault;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.vault.client.VaultClients;
import org.springframework.vault.core.VaultTemplate;
import org.springframework.vault.support.Versioned;

import java.util.Map;

@SpringBootApplication
public class MsVaultApplication {
    @Autowired
    private VaultTemplate vaultTemplate;

    public static void main(String[] args) {
        SpringApplication.run(MsVaultApplication.class, args);
    }
    @Bean
    CommandLineRunner start(VaultTemplate vaultTemplate){
        return args -> {
            Versioned.Metadata resp = vaultTemplate
                    .opsForVersionedKeyValue("secret")
                    .put("keypair", Map.of("privateKey","mySecret","publicKay","PK2"));
        };
    }

}
