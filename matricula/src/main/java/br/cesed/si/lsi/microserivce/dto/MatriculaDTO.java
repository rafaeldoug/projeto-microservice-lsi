package br.cesed.si.lsi.microserivce.dto;

public class MatriculaDTO {

	private Long alunoId;

	private Long disciplinaId;

	private Integer cursoCod;

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

	public Integer getCursoCod() {
		return cursoCod;
	}

	public void setCursoCod(Integer cursoCod) {
		this.cursoCod = cursoCod;
	}

}
