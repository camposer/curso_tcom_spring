package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import form.PersonaForm;

@Controller
@RequestMapping("/persona/*")
public class PersonaController {

		@RequestMapping("mostrar")
		public String cualquierCosa() {
			return "/jsp/persona/mostrar.jsp";
		}
		
//		@RequestMapping("resultado")
//		public String resultado(
//				@RequestParam String nombre,
//				@RequestParam String apellido,
//				@RequestParam Integer edad,
//				@RequestParam String btnAgregar,
//				Model model) {
//			
//			model.addAttribute("nombre", nombre);
//			model.addAttribute("apellido", apellido);
//			model.addAttribute("edad", edad);
//			
//			if (btnAgregar != null)
//				model.addAttribute("mensaje", "Agregando...");
//			else
//				model.addAttribute("mensaje", "Modificando...");
//			
//			return "/jsp/persona/resultado.jsp";
//		}
		
		@RequestMapping("resultado")
		public String resultado(PersonaForm p,
				@RequestParam String btnAgregar, Model model) {
			
			model.addAttribute("persona", p);
			
			if (btnAgregar != null)
				model.addAttribute("mensaje", "Agregando...");
			else
				model.addAttribute("mensaje", "Modificando...");
			
			return "/jsp/persona/resultado.jsp";
		}
}
