package br.com.alura.modulo.um;

public class CalculadorDeSalario {

	public double calcula(Funcionario funcionario) {
		return funcionario.getCargo().getRegra().calcula(funcionario);
	}
}
