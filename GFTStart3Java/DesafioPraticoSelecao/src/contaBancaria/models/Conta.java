package contaBancaria.models;

	public abstract class Conta implements IConta{
		
		private static int SEQUENCIAL = 1;
		
		protected int numero;
		protected String titular;
		protected double saldo;
		protected double rendimento;
		
		public Conta(String titular) {
			this.numero = SEQUENCIAL++;
			this.titular = titular;
		}
		
		public int getNumero() {
			return numero;
		}

		public String getTitular() {
			return titular;
		}

		public void setTitular(String titular) {
			this.titular = titular;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
			rendimento();
		}
		
		public void rendimento() {
			this.rendimento = getSaldo();
		}


		
		protected void imprimirInfosComuns() {
			System.out.println(String.format("Titular: %s", this.titular));
			System.out.println(String.format("Numero: %d", this.numero));
			System.out.println(String.format("Saldo: %.2f", this.saldo));
			System.out.println(String.format("Rendimento: %.2f", this.rendimento));
		}

	}

