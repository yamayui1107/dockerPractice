package com.dockerPracticeProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

// @SpringBootApplication
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DockerPracticeProjectApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerPracticeProjectApplication.class, args);
    }
}