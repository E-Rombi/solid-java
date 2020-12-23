package br.com.alura.modulo.dois;

public class EnviadorDeEmail implements AcaoAposGerarNotaFiscal {

    public void execute(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }
}
