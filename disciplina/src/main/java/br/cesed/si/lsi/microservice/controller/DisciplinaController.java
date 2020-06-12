package br.cesed.si.lsi.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cesed.si.lsi.microservice.model.Disciplina;
import br.cesed.si.lsi.microservice.repository.DisciplinaRepository;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {
	
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
	@GetMapping
	public ResponseEntity<Iterable<Disciplina>> getAll() {
		return ResponseEntity.ok(disciplinaRepository.findAll());
	}

}
