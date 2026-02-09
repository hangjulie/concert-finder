package com.juliehang.concertfinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.juliehang.concertfinder.repository")
public class ConcertFinderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConcertFinderApplication.class, args);
    }
}
