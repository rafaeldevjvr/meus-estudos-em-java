public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;

	public void deposita(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}

	public boolean saca(double valor) {
		if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		} else {
			return false;
		}
		
		

	}

	public boolean transfere(double valor, Conta destino) {
		if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}