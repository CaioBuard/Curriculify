package com.projeto.curriculify.ExpAcademica;

import java.time.LocalDateTime;
import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ExpAcademica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer idUsuario;
	private String instituicaoEnsino;
	private String curso;
	private LocalDateTime dataInicio;
    private LocalDateTime dataTermino;
	
    
    public ExpAcademica(Integer idUsuario, String instituicaoEnsino, String curso, LocalDateTime dataInicio,
			LocalDateTime dataTermino) {
		super();
		this.idUsuario = idUsuario;
		this.instituicaoEnsino = instituicaoEnsino;
		this.curso = curso;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
	}

    

	public ExpAcademica() {
		super();
	}

	public Integer getId() {
		return id;
	}



	public Integer getIdUsuario() {
		return idUsuario;
	}



	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getInstituicaoEnsino() {
		return instituicaoEnsino;
	}


	public void setInstituicaoEnsino(String instituicaoEnsino) {
		this.instituicaoEnsino = instituicaoEnsino;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public LocalDateTime getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}


	public LocalDateTime getDataTermino() {
		return dataTermino;
	}


	public void setDataTermino(LocalDateTime dataTermino) {
		this.dataTermino = dataTermino;
	}

}
