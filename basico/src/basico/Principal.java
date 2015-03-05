package basico;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {
	public static void main(String[] args) {
		// 1.- Instancian el contenedor de IoC (Inversion of Control)
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext();
		
		// 2.- Extrayendo bean del contenedor de IoC
		HolaMundo hm = ctx.getBean("hm", HolaMundo.class);
		hm.saludar("Juan"); // => Hola Juan
	}
}
