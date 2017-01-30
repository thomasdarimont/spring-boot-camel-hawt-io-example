package de.tdlabs.eai.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public interface App {

    static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
