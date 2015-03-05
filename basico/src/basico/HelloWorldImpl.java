package basico;

public class HelloWorldImpl implements HolaMundo {
	private Envoltorio env;
	
//	public HolaMundoImpl() {
//		this.env = new Envoltorio("Juan", 30);
//	}
	
	@Override
	public void saludar() {
		System.out.println("Hello " + env);
	}

	@Override
	public void setNombre(String nombre) {
		env.setNombre(nombre);
	}

	@Override
	public void setEdad(int edad) {
		env.setEdad(edad);
	}
	
	// Necesario para que Spring pueda inyectar la dependencia!!!
	public void setEnvoltorio(Envoltorio env) {
		this.env = env;
	}
	
}
