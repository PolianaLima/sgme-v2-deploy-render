package com.br.sgme.sgme;


import com.br.sgme.sgme.repository.UsuarioRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {
        UsuarioRepository.class
})
public class SgmeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SgmeApplication.class, args);
    }

}

