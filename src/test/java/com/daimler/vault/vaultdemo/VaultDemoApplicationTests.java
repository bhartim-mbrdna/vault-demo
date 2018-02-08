package com.daimler.vault.vaultdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.PostConstruct;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VaultDemoApplicationTests {

    @Value("${password}")
    String password;

    @Value("${email}")
    String email;

    @Value("${key}")
    String key;


	@Test
	public void contextLoads() {
        System.out.println("Test: \t My Email is: " + email);
        System.out.println("Test: \t My password is: " + password);
        System.out.println("Test: \t My Key is: " + key);
    }

}
