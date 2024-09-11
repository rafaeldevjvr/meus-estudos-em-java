//Gerente é um funcionario, Gerente herda da classe Funcionario, assina o contrato Autenticavel, é um Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	public double getBonificacao() {
		System.out.println("Chamando a bonificacao do GERENTE");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha){
		return this.autenticador.autentica(senha);
		}
}
