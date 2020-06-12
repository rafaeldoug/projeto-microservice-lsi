package br.cesed.si.lsi.microservice.curso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cesed.si.lsi.microservice.curso.model.Curso;
import br.cesed.si.lsi.microservice.curso.repository.CursoRepository;
import br.cesed.si.lsi.microservice.curso.service.CursoService;

@RestController
@RequestMapping("/info")
public class CursoController {

	@Autowired
	private CursoService cursoService;
	
	@Autowired
	private CursoRepository cursoRepository;

	@GetMapping
	public ResponseEntity<Iterable<Curso>> getAll() {
		return ResponseEntity.ok(cursoRepository.findAll());
	}
	
	@GetMapping("/{codigo}")
	public Curso getNomeCurso(@PathVariable Integer codigo) {
		return cursoService.getNomePorCodigo(codigo);
	}

}
