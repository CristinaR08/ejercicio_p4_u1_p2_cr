package com.example.demo.service1;

import com.example.demo.repository.modelo.PropietarioVehiculo;

public interface PropietarioVehiculoService {

	public void crear(PropietarioVehiculo prop);
	public PropietarioVehiculo buscarPropietario (String prop);
	public void actualizar(PropietarioVehiculo prop);
	public void borrar(String prop);
	
}
