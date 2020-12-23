package br.com.alura.modulo.dois;

import java.util.List;

public class GeradorDeNotaFiscal {

	private List<AcaoAposGerarNotaFiscal> acoes;

    public GeradorDeNotaFiscal(List<AcaoAposGerarNotaFiscal> acoes) {
		this.acoes = acoes;
        
    }

    public NotaFiscal gera(Fatura fatura) {

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

        acoes.forEach(a -> a.execute(nf));

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}