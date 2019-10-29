package co.edu.uan.parking;
/*
import java.util.Optional;
import org.springframework.boot.CommandLineRunner;
import javax.transaction.Transactional;
import org.springframework.context.annotation.Bean;
import co.edu.uan.sofeng.sample.samplespringweb.dominio.Cliente;
import co.edu.uan.sofeng.sample.samplespringweb.repositorio.ClienteRepositorio; */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PruebaInicializador {
    
        private static final Logger log = LoggerFactory.getLogger(PruebaInicializador.class);

	public static void main(String[] args) {
		SpringApplication.run(PruebaInicializador.class, args);
	}
            

        
}
