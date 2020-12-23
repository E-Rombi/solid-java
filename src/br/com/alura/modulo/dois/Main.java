package br.com.alura.modulo.dois;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		GeradorDeNotaFiscal geradorDeNotaFiscal = new GeradorDeNotaFiscal(Arrays.asList(new EnviadorDeEmail(), new NotaFiscalDao()));
	
		geradorDeNotaFiscal.gera(new Fatura(2000.00, "Eduardo"));
	
	}
}
