package br.cesed.si.lsi.microservice.curso.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import br.cesed.si.lsi.microservice.curso.model.Curso;
import br.cesed.si.lsi.microservice.curso.repository.CursoRepository;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CursoService {
	
	private List<Curso> cursos = new ArrayList<>();
	
	@Autowired
	private CursoRepository cursoRepository;

	@PostConstruct
	public void start() {
		cursos.add(new Curso(308, "Sistemas"));
		cursos.add(new Curso(101, "Medicina"));
		cursos.add(new Curso(204, "Odonto"));
		
		for (Curso curso : cursos) {
			cursoRepository.save(curso);
		}
		
	}
	
	public Curso getNomePorCodigo(Integer codigo) {
		
		return cursoRepository.findByCodigo(codigo);
		
	}

}
