package net.sparkworks.demo.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication(scanBasePackages = {"net.sparkworks.demo.sso"})
@EnableOAuth2Sso
public class SsoDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsoDemoApplication.class, args);
    }
}
