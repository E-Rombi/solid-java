package br.com.alura.modulo.dois;

public class NotaFiscalDao implements AcaoAposGerarNotaFiscal {

    public void execute(NotaFiscal nf) {
        System.out.println("salva nf no banco");
    }
}