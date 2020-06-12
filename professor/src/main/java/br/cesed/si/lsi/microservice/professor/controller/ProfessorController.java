package br.cesed.si.lsi.microservice.professor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cesed.si.lsi.microservice.professor.model.Professor;
import br.cesed.si.lsi.microservice.professor.repository.ProfessorRepository;
import br.cesed.si.lsi.microservice.professor.service.ProfessorService;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

	@Autowired
	private ProfessorService professorService;
	
	@Autowired
	private ProfessorRepository professorRepository;

	@GetMapping
	public ResponseEntity<Iterable<Professor>> getAll() {
		return ResponseEntity.ok(professorRepository.findAll());
	}

}
