// Gerente herda da classe FuncionarioAutenticavel
public class Gerente extends FuncionarioAutenticavel {

	public double getBonificacao() {
		System.out.println("Chamando a bonificacao do GERENTE");
		return super.getSalario();
	}

}
