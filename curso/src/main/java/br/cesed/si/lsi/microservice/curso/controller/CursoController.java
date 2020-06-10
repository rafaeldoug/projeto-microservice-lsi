package br.cesed.si.lsi.microservice.curso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cesed.si.lsi.microservice.curso.model.Curso;
import br.cesed.si.lsi.microservice.curso.service.CursoService;

@RestController
@RequestMapping("/info")
public class CursoController {

	@Autowired
	private CursoService cursoService;

	@RequestMapping("/{codigo}")
	public Curso getNomeCurso(@PathVariable Integer codigo) {
		return cursoService.getNomeCurso(codigo);
	}

}
