
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 242226);
		
		System.out.println(conta.getNumero());

		Cliente rafael = new Cliente();
		rafael.setNome("rafael luis");

		conta.setTitular(rafael);

		System.out.println(conta.getTitular().getNome());

		conta.getTitular().setProfissao("programador");
		// agora em duas linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");

		System.out.println(titularDaConta);
		System.out.println(rafael);
		System.out.println(conta.getTitular());
	}

}
