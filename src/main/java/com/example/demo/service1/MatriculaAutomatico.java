package com.example.demo.service1;

import java.math.BigDecimal;

public class MatriculaAutomatico implements Matricula{

	@Override
	public BigDecimal calcular(BigDecimal precioMatricula) {
		// Valor de matrícula = Precio * 0.15
		BigDecimal pago = precioMatricula.multiply(new BigDecimal(0.15));
		return pago;
	}

}
