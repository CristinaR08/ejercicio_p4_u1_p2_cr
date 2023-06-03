package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Vehiculo;

@SpringBootApplication
public class EjercicioP4U1P2CrApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EjercicioP4U1P2CrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Vehiculo auto1 = new Vehiculo();
		auto1.getPlaca();
		System.out.println(auto1);
		
		
	}
	
	

}
