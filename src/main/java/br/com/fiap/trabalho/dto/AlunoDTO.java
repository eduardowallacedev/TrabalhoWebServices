package br.com.fiap.trabalho.dto;

public class AlunoDTO {
	private String nome;
	private Long numeroCartao;
	private Integer id;
	private String cpf;
	
	public AlunoDTO(Integer id, String nome, String cpf ,Long numeroCartao) {
		this.id = id;
		this.nome = nome.toUpperCase();
		this.cpf = cpf;
		this.setNumeroCartao(numeroCartao);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}

	public Long getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(Long numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
