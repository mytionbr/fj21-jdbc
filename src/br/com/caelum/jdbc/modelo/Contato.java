package br.com.caelum.jdbc.modelo;

import java.util.Calendar;

public class Contato {
//o.	Dever�	ter	id,	nome,	email,	endere�o	e	uma	data	de	nascimento.
	private Long id;
	private String nome;
	private String email;
	private String endereco;
	private Calendar dataNascimento;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNacimento) {
		this.dataNascimento = dataNacimento;
	}
	
	
}
