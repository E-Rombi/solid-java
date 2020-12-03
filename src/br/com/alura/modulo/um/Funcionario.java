package br.com.alura.modulo.um;

public class Funcionario {

	private double salarioBase;
	private Cargo  cargo;

	public Funcionario() { }
	
	public Funcionario(double salarioBase, Cargo cargo) {
		this.salarioBase = salarioBase;
		this.cargo = cargo;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
}
