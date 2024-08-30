import java.util.Random;

public class CPFComLetrasENumeros {

	public static void main(String[] args) {
		System.out.println(gerarCPFComLetrasENumeros());

	}

	public static String gerarCPFComLetrasENumeros() {
		Random random = new Random();
		StringBuilder cpf = new StringBuilder();

		// Tamanho total do CPF é de 11 caracteres (somente letras e números)
		for (int i = 0; i < 11; i++) {
			// Alternar entre letras e números
			if (random.nextBoolean()) {
				// Gera uma letra aleatória (A-Z)
				char letra = (char) (random.nextInt(26) + 'A');
				cpf.append(letra);
			} else {
				// Gera um número aleatório (0-9)
				int numero = random.nextInt(10);
				cpf.append(numero);
			}

			// Adiciona os separadores nos lugares corretos
			if (i == 2 || i == 5) {
				cpf.append('.');
			} else if (i == 8) {
				cpf.append('-');
			}
		}

		return cpf.toString();
	}
}
