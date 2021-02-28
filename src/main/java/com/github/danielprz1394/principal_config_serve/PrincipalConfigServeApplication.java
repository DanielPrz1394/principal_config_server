package com.github.danielprz1394.principal_config_serve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PrincipalConfigServeApplication {
    public static void main(String[] args) {
        SpringApplication.run(PrincipalConfigServeApplication.class, args);
    }
}
