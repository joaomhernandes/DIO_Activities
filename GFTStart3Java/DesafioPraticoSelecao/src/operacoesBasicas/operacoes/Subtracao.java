package operacoesBasicas.operacoes;

import operacoesBasicas.Operacoes;

public class Subtracao implements Operacoes {

	@Override
	public double calcula(int a, int b) {
		return a-b;
	}

}
