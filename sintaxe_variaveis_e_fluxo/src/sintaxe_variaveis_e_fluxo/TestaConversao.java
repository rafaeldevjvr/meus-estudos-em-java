package sintaxe_variaveis_e_fluxo;

public class TestaConversao {
	
	public static void main(String[] args) {
		
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		long numeroGrande = 32432423523L;
		
		System.out.println(numeroGrande);
		
		double valor1 = 0.1;
		double valor2 = 0.2;
		double total = valor1 + valor2;
		
		System.out.println(total);
	}

}
