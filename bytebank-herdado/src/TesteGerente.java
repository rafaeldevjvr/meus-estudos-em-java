
public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("marco");
		g1.setCpf("2355684-13");
		g1.setSalario(5000.0);

		System.out.println("Nome do Gerente: " + g1.getNome());
		System.out.println("Cpf: " + g1.getCpf());
		System.out.println("Salário: R$" + g1.getSalario());

		g1.setSenha(2222);
		boolean autenticou = g1.autentica(2222);

		System.out.println("Acesso com senha: " + autenticou);

	}

}
