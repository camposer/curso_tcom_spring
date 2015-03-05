package com.organizacion.ejercicio1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.organizacion.ejercicio1.gui.CalculadoraGui;

public class Principal  {
    public static void main( String[] args ) {
        ApplicationContext ctx = 
        		new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.getBean("calculadoraGui", CalculadoraGui.class).iniciar();
    }
}
