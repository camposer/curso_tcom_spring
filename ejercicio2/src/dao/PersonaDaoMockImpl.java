package dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import model.Persona;

@Component
public class PersonaDaoMockImpl implements PersonaDao {
	private List<Persona> personas = new ArrayList<Persona>();
	private int contador = 1;

	@PostConstruct
	public void inicializar() { // Se ejecuta después de creado el bean e inyectadas las dependencias correspondientes
		agregar(new Persona("Juan", "Pérez", 30));
		agregar(new Persona("María", "García", 20));
		agregar(new Persona("Pedro", "González", 25));
		agregar(new Persona("Mario", "Mendoza", 40));
	}
	
	private int obtenerPos(Integer id) {
		for (int i = 0; i < personas.size(); i++)
			if (personas.get(i).getId().equals(id))
				return i;
		return -1;
	}
	
	@Override
	public void agregar(Persona p) {
		p.setId(contador++);
		personas.add(p);
	}

	@Override
	public void modificar(Persona p) {
		int pos = obtenerPos(p.getId());
		if (pos > 0)
			personas.set(pos, p);
	}

	@Override
	public void eliminar(Integer id) {
		int pos = obtenerPos(id);
		if (pos > 0)
			personas.remove(pos);
	}

	@Override
	public Persona obtener(Integer id) {
		int pos = obtenerPos(id);
		if (pos > 0)
			return personas.get(pos);
		else
			return null;
	}

	@Override
	public List<Persona> obtenerTodos() {
		return personas;
	}

}
