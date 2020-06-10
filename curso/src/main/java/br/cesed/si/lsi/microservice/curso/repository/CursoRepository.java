package br.cesed.si.lsi.microservice.curso.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.cesed.si.lsi.microservice.curso.model.Curso;

@Repository
public interface CursoRepository extends CrudRepository<Curso, Long>{

	Curso findByCodigo(Integer codigo);

}
