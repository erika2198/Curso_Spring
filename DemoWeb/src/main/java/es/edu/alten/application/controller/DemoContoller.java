package es.edu.alten.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import es.edu.alten.application.model.Persona;
import es.edu.alten.application.repo.IPersonaRepo;

@Controller
public class DemoContoller{
	@Autowired
	private IPersonaRepo repo;

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
		
		if(name.endsWith("World")) {
			repo.delete(new Persona(2, "Francisco"));
			name="Hugo";
		}
		Persona persona = new Persona(1, name);
		repo.save(persona);
		
		model.addAttribute("name", name);
		return "greeting";
	}

}
