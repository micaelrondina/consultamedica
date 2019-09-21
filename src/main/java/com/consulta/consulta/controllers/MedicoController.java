package com.consulta.consulta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.consulta.consulta.models.Medico;
import com.consulta.consulta.repository.MedicoRepository;

@Controller
public class MedicoController {
	
	@Autowired
	private MedicoRepository mr;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
		public String form() {
		return "register";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String form(Medico medico) {
		mr.save(medico);
	return "redirect:/";
}
}
