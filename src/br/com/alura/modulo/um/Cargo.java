package br.com.alura.modulo.um;

public enum Cargo {

	DESENVOLVEDOR(new DezOuVintePorCento()),
	TESTER(new QuinzeOuVinteCincoPorCento()),
	GERENTE(new QuinzeOuVinteCincoPorCento());
	
	
	private RegraDeCalculo regra;

	Cargo(RegraDeCalculo regra) {
		this.regra = regra;		
	}
	
	public RegraDeCalculo getRegra() {
		return regra;
	}
}
