package br.cesed.si.lsi.microservice.professor.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cesed.si.lsi.microservice.professor.model.Professor;
import br.cesed.si.lsi.microservice.professor.repository.ProfessorRepository;

@Service
public class ProfessorService {

	@Autowired
	private ProfessorRepository professorRepository;

	public Optional<Professor> getNomeProfessor(Long id) {

		return professorRepository.findById(id);

	}

}
