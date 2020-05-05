package br.com.tokiomarine.seguradora.avaliacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.tokiomarine.seguradora.avaliacao.service.EstudanteService;


@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	EstudanteService service;

	@GetMapping("/")
	public String home(Model model) {
		System.out.println("======================================================");
		model.addAttribute("estudantes", service.buscarEstudantes());
		return "home";
	}

}
