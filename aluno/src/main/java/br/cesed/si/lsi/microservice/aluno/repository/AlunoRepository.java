package br.cesed.si.lsi.microservice.aluno.repository;

import org.springframework.data.repository.CrudRepository;

import br.cesed.si.lsi.microservice.aluno.model.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, Long>{

}
