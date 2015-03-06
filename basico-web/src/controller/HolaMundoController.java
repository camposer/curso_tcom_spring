package controller;

import javax.servlet.http.HttpServletRequest;

import model.Persona;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HolaMundoController {
	// http://localhost:8080/basico-web/holaMundo.do
	@RequestMapping("/holaMundo")
	public @ResponseBody String holaMundo() { // No utilizar porque el html debería estar en una JSP
		String html = "<html>" +
				"<head><title>Hola mundo</title></head>" +
				"<body>Hola mundo</body>" +
				"</html>";
		
		return html;
	}
	
	@RequestMapping("/holaMundo1")
	public String holaMundo1() {
		return "holaMundo.jsp";
	}
	
	@RequestMapping("/holaMundo2")
	public String holaMundo2(HttpServletRequest request) { // No utilizar, porque es como un servlet!
		String nombre = request.getParameter("nombre");
		
		request.setAttribute("nombre", nombre);
		
		return "holaMundo.jsp";
	}	
	
	@RequestMapping("/holaMundo3")
	public String holaMundo3(@RequestParam("nombre") String n, Model model) {
		model.addAttribute("nombre", n);
		return "holaMundo.jsp";
	}	
	
	@RequestMapping("/holaMundo4")
	public ModelAndView holaMundo4(@RequestParam String nombre) {
		return new ModelAndView("holaMundo.jsp", "nombre", nombre);
	}	
	
	@RequestMapping("/holaMundo5")
	public ModelAndView holaMundo5(Persona p) {
		return new ModelAndView("holaMundo.jsp", "nombre", p.getNombre());
	}	
	
	
}
