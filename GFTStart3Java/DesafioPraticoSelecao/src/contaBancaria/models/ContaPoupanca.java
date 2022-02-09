package contaBancaria.models;

public class ContaPoupanca extends Conta{

	
	
	public ContaPoupanca(String titular) {
		super(titular);
	}
	
	@Override
	public void rendimento() {
		this.rendimento = getSaldo()*0.07;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
}