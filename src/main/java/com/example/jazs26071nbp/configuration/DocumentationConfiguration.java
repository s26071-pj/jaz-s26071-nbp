package com.example.jazs26071nbp.configuration;

import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
@Configuration
public class DocumentationConfiguration {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("NBP Currency counting API Documentation")
                        .version("v2.1.3.7")
                        .description("Application that will help me pass the JAZ Subject"));
    }
}
