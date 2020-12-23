package br.com.alura.modulo.tres;

public class Frete implements ServicoEntrega {
	
    public double para(String cidade) {
        if("SAO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        }
        return 30;
    }
}