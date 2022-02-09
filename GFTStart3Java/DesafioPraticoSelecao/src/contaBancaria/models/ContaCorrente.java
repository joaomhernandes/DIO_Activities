package contaBancaria.models;

public class ContaCorrente extends Conta{

	public ContaCorrente(String titular) {
		super(titular);

	}
	
	@Override
	public void rendimento() {
		this.rendimento = getSaldo()*0.05;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
}

