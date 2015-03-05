package com.organizacion.ejercicio1.gui;

import java.util.Scanner;

import com.organizacion.ejercicio1.util.Calculadora;

public class CalculadoraGui {
	private Scanner scanner = new Scanner(System.in);
	private Calculadora calc; // Inyectado por Spring!!
	
	public void setCalculadora(Calculadora calc) {
		this.calc = calc;
	}

	public void iniciar() {
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.print("? ");
		
		String operacion = scanner.nextLine();
		
		System.out.print("a? ");
		float a = Float.parseFloat(scanner.nextLine());
		System.out.print("b? ");
		float  b = Float.parseFloat(scanner.nextLine());
		
		if (operacion.equals("1"))
			System.out.println(a + " + " + b + " = " + calc.sumar(a, b));
		else if (operacion.equals("2"))
			System.out.println(a + " + " + b + " = " + calc.restar(a, b));
		else if (operacion.equals("3"))
			System.out.println(a + " * " + b + " = " + calc.multiplicar(a, b));
		else
			System.out.println(a + " * " + b + " = " + calc.dividir(a, b));
	}
}








