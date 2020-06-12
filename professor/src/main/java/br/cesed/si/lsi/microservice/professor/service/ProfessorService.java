package br.cesed.si.lsi.microservice.professor.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cesed.si.lsi.microservice.professor.model.Professor;
import br.cesed.si.lsi.microservice.professor.repository.ProfessorRepository;

@Service
public class ProfessorService {
	
	private List<Professor> professores = new ArrayList<>();
	
	@Autowired
	private ProfessorRepository professorRepository;

	@PostConstruct
	public void start() {
		professores.add(new Professor("Zébedeu", 308));
		professores.add(new Professor("Mariazinha", 101));
		professores.add(new Professor("Cristofone", 204));
		
		for (Professor professor : professores) {
			professorRepository.save(professor);
		}
	}
}
