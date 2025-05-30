package org.kbapps.tigrinya_blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TigrinyaBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(TigrinyaBlogApplication.class, args);
    }

}
