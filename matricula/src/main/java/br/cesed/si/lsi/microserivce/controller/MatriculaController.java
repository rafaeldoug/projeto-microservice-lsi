package br.cesed.si.lsi.microserivce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cesed.si.lsi.microserivce.dto.MatriculaDTO;
import br.cesed.si.lsi.microserivce.service.MatriculaService;

@RestController
@RequestMapping("/matricula")
public class MatriculaController {
	
	@Autowired
	private MatriculaService matriculaService;
	
	@PostMapping
	public void realizaMatricula(@RequestBody MatriculaDTO matricula) {
		matriculaService.realizaMatricula(matricula);
	}

}
