package br.cesed.si.lsi.microservice.aluno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cesed.si.lsi.microservice.aluno.model.Aluno;
import br.cesed.si.lsi.microservice.aluno.repository.AlunoRepository;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@GetMapping
	public ResponseEntity<Iterable<Aluno>> getAll() {
		return ResponseEntity.ok(alunoRepository.findAll());
	}

}
