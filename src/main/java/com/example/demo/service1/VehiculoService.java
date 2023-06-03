package com.example.demo.service1;

import com.example.demo.repository.modelo.Vehiculo;

public interface VehiculoService {

	public void crear(Vehiculo prop);
	public Vehiculo buscarVehiculo (String prop);
	public void actualizar(Vehiculo prop);
	public void borrar(String prop);

}
