
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;

		System.out.println("primeira conta tem R$" + primeiraConta.saldo);
		System.out.println("segunda conta tem R$" + segundaConta.saldo);

		primeiraConta.agencia = 146;
		System.out.println("agência: " + primeiraConta.agencia);
		System.out.println("saldo: R$" + primeiraConta.saldo);

		segundaConta.agencia = 146;
		System.out.println("agora a segunda conta está " + " na agência " + segundaConta.agencia);

		if (primeiraConta == segundaConta) {
			System.out.println("mesma conta");
		} else {
			System.out.println("contas diferentes");
		}

		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
