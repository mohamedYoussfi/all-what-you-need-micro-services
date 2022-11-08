package org.sid.consulconfigservicetest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
@RestController
@Configuration
public class ConsulConfigServiceTestApplication {
	@Autowired
	AppConfig appConfig;
	@Value("${user.username}")
	private String username;
	public static void main(String[] args) {
		SpringApplication.run(ConsulConfigServiceTestApplication.class, args);
	}
	@GetMapping("/config")
	public AppConfig getConfig(){
		return appConfig;
	}
	@GetMapping("/credentials")
	public String getCredentials(){
		return username;
	}


}
