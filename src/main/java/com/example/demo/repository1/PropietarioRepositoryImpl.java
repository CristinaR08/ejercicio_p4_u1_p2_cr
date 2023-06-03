package com.example.demo.repository1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.example.demo.repository.modelo.PropietarioVehiculo;

@Repository
public class PropietarioRepositoryImpl implements PropietarioRepository{

	private static List<PropietarioVehiculo> baseDatos = new ArrayList<>();
	
	@Override
	public void create(PropietarioVehiculo prop) {
		baseDatos.add(prop);
	}

	@Override
	public PropietarioVehiculo readP(String identificacion) {
		PropietarioVehiculo propietarioEncontrado = new PropietarioVehiculo();
		for (PropietarioVehiculo CI : baseDatos) {
			if (identificacion.equals(CI.getIdentificacion())) {
				propietarioEncontrado = CI;
			}
		}
		return propietarioEncontrado;
	}

	@Override
	public void update(PropietarioVehiculo prop) {
		this.delete(prop.getIdentificacion());
		this.create(prop);
	}

	@Override
	public void delete(String prop) {
		PropietarioVehiculo CI= new PropietarioVehiculo();
		baseDatos.remove(CI);
	
	}

}
