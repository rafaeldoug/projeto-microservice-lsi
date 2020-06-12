package br.cesed.si.lsi.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cesed.si.lsi.microservice.dto.MatriculaDTO;
import br.cesed.si.lsi.microservice.model.Matricula;
import br.cesed.si.lsi.microservice.repository.MatriculaRepository;
import br.cesed.si.lsi.microservice.service.MatriculaService;

@RestController
@RequestMapping("/matricula")
public class MatriculaController {
	
	@Autowired
	private MatriculaService matriculaService;
	
	@Autowired
	private MatriculaRepository matriculaRepository;
	
	@GetMapping
	public ResponseEntity<Iterable<Matricula>> getAll() {
		return ResponseEntity.ok(matriculaRepository.findAll());
	}
	
	@PostMapping
	public void realizaMatricula(@RequestBody MatriculaDTO matricula) {
		matriculaService.realizaMatricula(matricula);
	}

}
