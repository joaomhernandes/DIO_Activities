package contaBancaria;

import contaBancaria.models.Conta;
import contaBancaria.models.ContaCorrente;
import contaBancaria.models.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente("Jo�o");
		cc.setSaldo(1000.00);
		
		ContaPoupanca cp = new ContaPoupanca("Jos�");
		cp.setSaldo(1000);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
