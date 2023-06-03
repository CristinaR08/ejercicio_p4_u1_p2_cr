package com.example.demo.repository1;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.PropietarioVehiculo;

@Repository
public interface PropietarioRepository {

	public void create(PropietarioVehiculo prop);
	public PropietarioVehiculo readP (String prop);
	public void update(PropietarioVehiculo prop);
	public void delete(String prop);
	
}
