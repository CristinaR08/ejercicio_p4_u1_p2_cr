package com.example.demo.repository1;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Vehiculo;

@Repository
public interface VehiculoRepository {

	public void create(Vehiculo vehiculo);
	public Vehiculo readP (String vehiculo);
	public void update(Vehiculo vehiculo);
	public void delete(String vehiculo);
	
	
	
}
