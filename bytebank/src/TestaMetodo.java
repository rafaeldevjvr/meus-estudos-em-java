
public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaDoRafa = new Conta();
		contaDoRafa.saldo = 100;
		contaDoRafa.deposita(50);
		System.out.println("seu saldo é de: R$" + contaDoRafa.saldo + " reais");
		boolean conseguiuRetirar = contaDoRafa.saca(20);
		System.out.println("seu novo saldo é de: R$" + contaDoRafa.saldo + " reais");
		System.out.println(conseguiuRetirar);

		Conta contaDaMaria = new Conta();
		contaDaMaria.deposita(1000);

		if (contaDaMaria.transfere(300, contaDoRafa)) {
			System.out.println("transferencia feita com sucesso!");
		} else {
			System.out.println("faltou dinheiro!");
		}
		System.out.println("seu saldo é de: R$" + contaDaMaria.saldo + " reais");
		System.out.println("seu novo saldo é de: R$" + contaDoRafa.saldo + " reais");

		contaDoRafa.titular = "Rafael luis";
		System.out.println(contaDoRafa.titular);
	}
}
