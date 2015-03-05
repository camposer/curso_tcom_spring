package com.organizacion.ejercicio1.util;

import org.springframework.stereotype.Component;

@Component // Spring creará una instancia de esta clase
public class CalculadoraImpl implements Calculadora {

	public float sumar(float a, float b) {
		return a + b;
	}

	public float dividir(float a, float b) {
		return a / b;
	}

	public float multiplicar(float a, float b) {
		return a * b;
	}

	public float restar(float a, float b) {
		return a - b;
	}

}
