package com.programmingcodez.userservice.Config;

  // Replace with your actual package

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")  // Allows requests to endpoints starting with /api/
                .allowedOrigins("http://localhost:3000")  // Allows requests from React frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE");  // Allowed HTTP methods
    }
}
