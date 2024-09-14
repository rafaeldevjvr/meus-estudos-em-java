
public class TiposDeDados {

	public static void main(String[] args) {

		String nome = "João Pedro";
		int idade = 18;
		double altura = 1.70;
		char inicial = 'J';
		boolean ativo = true;

		if (idade >= 18) {
			System.out.println("Cadastro aprovado.");
		} else {
			System.out.println("Cadastro negado.");
		}

		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Altura: " + altura + " cm");
		System.out.println("Letra inicial: " + inicial);
		System.out.println("Status: " + ativo);

		System.out.println("Dias de trabalho:");

		for (int DiasDeTrabalho = 1; DiasDeTrabalho <= 5; DiasDeTrabalho++) {
			switch (DiasDeTrabalho) {
			case 1:
				System.out.println("Segunda-feira");
				break;
			case 2:
				System.out.println("Terça-feira");
				break;
			case 3:
				System.out.println("Quarta-feira");
				break;
			case 4:
				System.out.println("Quinta-feira");
				break;
			case 5:
				System.out.println("Sexta-feira");
				break;
			default:
				System.out.println("Outro dia");
			}
		}

	}

}
//Inteiros:
// byte: 8 bits, -128 a 127
// short: 16 bits, -32.768 a 32.767
// int: 32 bits, -2^31 a 2^31-1
// : 64 bits, -2^63 a 2^63-1

// Ponto Flutuante:
// float: 32 bits, precisão de aproximadamente 7 dígitos decimais
// double: 64 bits, precisão de aproximadamente 15 dígitos decimais

// Caractere:
// char: 16 bits, representa um único caractere Unicode

// Booleano:
// boolean: Representa verdadeiro (true) ou falso (false)
