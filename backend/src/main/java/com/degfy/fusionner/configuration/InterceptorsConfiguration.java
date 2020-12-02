package com.degfy.fusionner.configuration;

import com.degfy.fusionner.interceptor.AuthInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorsConfiguration implements WebMvcConfigurer {

    @Bean
    public AuthInterceptor buildAuthInterceptor() {
        return new AuthInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry
                .addInterceptor(buildAuthInterceptor())
                .addPathPatterns("/**");
    }
}
