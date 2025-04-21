package com.azureDemo.azureDemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

      @Override
      public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                        .allowedOrigins("http://localhost:4200")
                        .allowedOrigins("https://kind-sand=0ce665403.6.azurestaticapps.net")
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
      }

}