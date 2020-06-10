package br.cesed.si.lsi.microservice.professor.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.cesed.si.lsi.microservice.professor.model.Professor;

@Repository
public interface ProfessorRepository extends CrudRepository<Professor, Long>{

	Optional<Professor> findById(Long id);

}
