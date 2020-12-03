package br.com.alura.modulo.um;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		CalculadorDeSalario calculadorDeSalario = new CalculadorDeSalario();
		
		List<Funcionario> funcionarios = Arrays.asList(new Funcionario(2653.0, Cargo.DESENVOLVEDOR), 
													   new Funcionario(1500.0, Cargo.TESTER), 
													   new Funcionario(5000.0, Cargo.GERENTE));
	
		funcionarios.forEach(f -> System.out.println(calculadorDeSalario.calcula(f)));			
	}
}
