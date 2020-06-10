package br.cesed.si.lsi.microservice.professor.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cesed.si.lsi.microservice.professor.model.Professor;
import br.cesed.si.lsi.microservice.professor.service.ProfessorService;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

	@Autowired
	private ProfessorService professorService;

	@RequestMapping("/{id}")
	public Optional<Professor> getNomeProfessor(@PathVariable Long id) {
		return professorService.getNomeProfessor(id);

	}

}
