package com.example.jazs26071nbp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class JazS26071NbpApplication {

    public static void main(String[] args) {
        SpringApplication.run(JazS26071NbpApplication.class, args);
    }

}
