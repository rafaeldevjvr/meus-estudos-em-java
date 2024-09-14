
public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();

		primeiraConta.saldo = 300;
		System.out.println("saldo da primeira conta: R$" + primeiraConta.saldo + " reais");

		Conta segundaConta = primeiraConta;
		System.out.println("saldo da segunda conta: R$" + segundaConta.saldo + " reais");

		segundaConta.saldo += 100;
		System.out.println("saldo da segunda conta: R$" + segundaConta.saldo + " reais");

		System.out.println("saldo da primeira conta: R$" + primeiraConta.saldo + " reais");

		if (primeiraConta == segundaConta) {

			System.out.println("são a mesmissima conta");

		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
