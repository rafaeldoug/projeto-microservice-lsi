package br.cesed.si.lsi.microservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Matricula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long alunoId;

	private Long disciplinaId;

	private Long cursoId;

	public Matricula() {
	}

	public Matricula(Long id, Long alunoId, Long disciplinaId, Long cursoId) {
		this.id = id;
		this.alunoId = alunoId;
		this.disciplinaId = disciplinaId;
		this.cursoId = cursoId;
	}

	public Long getId() {
		return id;
	}

	public Long getAlunoId() {
		return alunoId;
	}

	public void setAlunoId(Long alunoId) {
		this.alunoId = alunoId;
	}

	public Long getDisciplinaId() {
		return disciplinaId;
	}

	public void setDisciplinaId(Long disciplinaId) {
		this.disciplinaId = disciplinaId;
	}

	public Long getCursoId() {
		return cursoId;
	}

	public void setCursoId(Long cursoId) {
		this.cursoId = cursoId;
	}

}
