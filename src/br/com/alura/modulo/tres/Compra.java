package br.com.alura.modulo.tres;

public class Compra {

	private String cidade;
	private Double valor;
	
	public Compra() { }
	
	public Compra(String cidade, Double valor) {
		super();
		this.cidade = cidade;
		this.valor = valor;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
}
