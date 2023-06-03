package com.example.demo.service1;

import java.math.BigDecimal;

public class MatriculaManual implements Matricula{

	@Override
	public BigDecimal calcular(BigDecimal precioMatricula) {
		// Valor de matrícula = Precio * 0.10
		BigDecimal pago = precioMatricula.multiply(new BigDecimal(0.10));
		return pago;
	}

}
