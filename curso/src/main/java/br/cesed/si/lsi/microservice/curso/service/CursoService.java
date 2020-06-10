package br.cesed.si.lsi.microservice.curso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cesed.si.lsi.microservice.curso.model.Curso;
import br.cesed.si.lsi.microservice.curso.repository.CursoRepository;

@Service
public class CursoService {
	
	@Autowired
	private CursoRepository cursoRepository;

	public Curso getNomeCurso(Integer codigo) {
		
		return cursoRepository.findByCodigo(codigo);
		
	}

}
