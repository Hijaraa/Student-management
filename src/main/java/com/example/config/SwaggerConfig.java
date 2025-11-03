package com.example.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI studentManagementOpenAPI() {
        Server server = new Server();
        server.setUrl("http://localhost:8080");
        server.setDescription("Serveur de développement");

        return new OpenAPI()
                .servers(List.of(server))
                .info(new Info()
                        .title("Student Management API")
                        .description("API REST pour la gestion des étudiants. Cette API permet de créer, lire, mettre à jour et supprimer des informations sur les étudiants.")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Admin")
                                .email("admin@example.com")
                                .url("http://localhost:8080"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://www.apache.org/licenses/LICENSE-2.0.html")));
    }
}