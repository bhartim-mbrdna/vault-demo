package com.daimler.vault.vaultdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class VaultDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaultDemoApplication.class, args);
	}

	@Value("${password}")
    String password;

	@Value("${email}")
	String email;

    @Value("${key}")
    String key;

	@PostConstruct
	public void postConstruct() {
        System.out.println("Main: \t My Email is: " + email);
        System.out.println("Main: \t My password is: " + password);
        System.out.println("Main: \t My Key is: " + key);
    }
}
