package com.organizacion.ejercicio1.gui;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.organizacion.ejercicio1.util.Calculadora;
 
@Component("calculadoraGui") // Cambiado nombre (era por defecto calculadoraGuiImpl)
@Scope("singleton") // por defecto
public class CalculadoraGuiImpl implements CalculadoraGui {
	private Scanner scanner = new Scanner(System.in);
	
	@Autowired // Inyecta por tipo de dato
	@Qualifier("calculadoraImpl") // Nombre por defecto
	private Calculadora calc; // Inyectado por Spring!!
	
	public void setCalculadora(Calculadora calc) { // Sólo para inyección desde archivo XML
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








