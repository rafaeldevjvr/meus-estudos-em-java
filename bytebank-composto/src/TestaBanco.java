
public class TestaBanco {

	public static void main(String[] args) {

		Cliente rafael = new Cliente();
		rafael.nome = "rafael silveira";
		rafael.cpf = "222.222.222-22";
		rafael.profissao = "programador";

		Conta contaDoRafa = new Conta();
		contaDoRafa.deposita(100);

		// associa o cliente rafael a conta contaDoRafa
		contaDoRafa.titular = rafael;
		System.out.println(contaDoRafa.titular.nome);
		System.out.println(contaDoRafa.titular);
		System.out.println(rafael);

	}
}
