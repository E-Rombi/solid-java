package br.com.alura.modulo.tres;

public class CalculadoraDePrecos {

	private TabelaPreco tabelaPreco;
	private ServicoEntrega servicoEntrega;

	public CalculadoraDePrecos(TabelaPreco tabelaPreco, ServicoEntrega servicoEntrega) {
		this.tabelaPreco = tabelaPreco;
		this.servicoEntrega = servicoEntrega;
		
	}
	
    public double calcula(Compra produto) {

    	double desconto = tabelaPreco.descontoPara(produto.getValor());
    	double frete = servicoEntrega.para(produto.getCidade());

        return produto.getValor() * (1-desconto) + frete;
    }
}