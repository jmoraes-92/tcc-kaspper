package com.orcamentos.kaspper.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30) // Usando OpenAPI 3.0
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.orcamentos.kaspper.controller")) // Escanear apenas controladores
                .paths(PathSelectors.any()) // Incluir todos os endpoints
                .build()
                .useDefaultResponseMessages(false); // Remove mensagens padrão do Spring
    }
}
