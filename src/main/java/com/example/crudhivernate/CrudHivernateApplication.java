package com.example.crudhivernate;

import com.example.crudhivernate.Models.Dao.INadadorDAO;
import com.example.crudhivernate.Models.Entity.Nadador;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudHivernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudHivernateApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(INadadorDAO nadadorDAO) {
		return runner -> {
			System.out.println("Hola Clase");
			createNadador(nadadorDAO);
		};

	}

	private void createNadador(INadadorDAO nadadorDAO) {
		System.out.println("Creando un nuevo nadador...");
		Nadador nadador = new Nadador();

		nadador.setNombre("Juan");
		nadador.setEdad(23);
		nadador.setEmail(2);

		System.out.println("Grabando nadador....");
		nadadorDAO.save(nadador);

		System.out.println("NAdador guardado, con id: " + nadador.getId());
	}

}
