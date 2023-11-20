package com.br.sgme.sgme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SgmeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SgmeApplication.class, args);
    }

}
