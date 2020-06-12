package br.cesed.si.lsi.microservice.controller;

import org.springframework.data.repository.CrudRepository;

import br.cesed.si.lsi.microservice.model.Disciplina;

public interface DisciplinaRepository extends CrudRepository<Disciplina, Long>{

}
