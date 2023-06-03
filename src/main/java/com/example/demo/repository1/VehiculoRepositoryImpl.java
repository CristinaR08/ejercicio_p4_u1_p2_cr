package com.example.demo.repository1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.example.demo.repository.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements VehiculoRepository{
	
	private static List<Vehiculo> baseDatos = new ArrayList<>();

	@Override
	public void create(Vehiculo vehiculo) {
		baseDatos.add(vehiculo);
	}

	@Override
	public Vehiculo readP(String vehiculo) {
		Vehiculo autoEncontrado = new Vehiculo();
		for (Vehiculo auto : baseDatos) {
			if (vehiculo.equals(auto.getPlaca())) {
				autoEncontrado = auto;
			}
		}
		return autoEncontrado;
	}

	@Override
	public void update(Vehiculo vehiculo) {
		this.delete(vehiculo.getPlaca());
		this.create(vehiculo);
		
	}

	@Override
	public void delete(String vehiculo) {
		Vehiculo auto = new Vehiculo();
		baseDatos.remove(auto);
		
	}

	

	
}
