package br.cesed.si.lsi.microservice.professor.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cesed.si.lsi.microservice.professor.model.Professor;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

	@GetMapping
	public List<Professor> findAll() {
		return new ArrayList<>();
	}

}
