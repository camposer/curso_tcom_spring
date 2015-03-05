package basico;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {
	public static void main(String[] args) {
		// 1.- Instancian el contenedor de IoC (Inversion of Control)
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2.- Extrayendo bean del contenedor de IoC

		// Probando singleton
		HolaMundo hm1_1 = (HolaMundo)ctx.getBean("hm1");
		hm1_1.saludar(); // => Hola Juan
		
		hm1_1.setNombre("Pedro");
		
		HolaMundo hm1_2 = ctx.getBean("hm1", HolaMundo.class);
		hm1_2.saludar(); // => Hola Pedro
		
		if (hm1_2 instanceof HolaMundoImpl) { // Hay que validar!!
			HolaMundoImpl hmImpl = (HolaMundoImpl)hm1_2; 
			System.out.println("edad = " + hmImpl.getEdad()); 
		}
		
		// Probando prototype
		HolaMundo hm2_1 = ctx.getBean("hm2", HolaMundo.class);
		hm2_1.saludar(); // => Hola Juan
		
		hm2_1.setNombre("Pedro");
		
		HolaMundo hm2_2 = ctx.getBean("hm2", HolaMundo.class);
		hm2_2.saludar(); // => Hola Juan
	
	}
}
