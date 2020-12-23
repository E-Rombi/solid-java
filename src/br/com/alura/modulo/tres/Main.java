package br.com.alura.modulo.tres;

public class Main {

	public static void main(String[] args) {
		CalculadoraDePrecos calcDePrecos = new CalculadoraDePrecos(new TabelaDePrecoPadrao(), new Frete());
	
		double calcula = calcDePrecos.calcula(new Compra("SAO PAULO", 500.00));
		System.out.println(calcula);
	}
}
