package com.example.demo.repository.modelo;

import java.time.LocalDate;

public class PropietarioVehiculo {

	private String nombre;
	private String apellido;
	private String identificacion;
	private LocalDate fechaNacimiento;
	
	@Override
	public String toString() {
		return "PropietarioVehiculo [nombre=" + nombre + ", apellido=" + apellido + ", identificacion=" + identificacion
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	//getters setteres
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
}

