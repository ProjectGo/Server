package server.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import server.service.Api;
import server.service.ApiImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "server")
public class HelloWorldConfiguration {
    @Bean
    public Api api() {
        return new ApiImpl();
    }
}