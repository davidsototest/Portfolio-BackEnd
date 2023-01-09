package com.PDS.PDS;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer {
    
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
                @Override
                public void addCorsMappings(CorsRegistry registry) {
                        registry.addMapping("/**")
                                .allowedOrigins("http://localhost:9001")
                                .allowedMethods("GET", "POST", "PUT", "DELETE")
                                .maxAge(3600);
                }

        };
}

//    @Override
//
//    public void addCorsMappings(CorsRegistry registry) {
//
//        registry.addMapping("/**");
//
//    }

   

}