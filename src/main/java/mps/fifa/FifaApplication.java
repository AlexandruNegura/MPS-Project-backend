package mps.fifa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class FifaApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(FifaApplication.class, args);
    }

}
