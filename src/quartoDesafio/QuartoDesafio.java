package quartoDesafio;

import java.util.Scanner;

public class QuartoDesafio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o número de casos de teste:");
		int numCasos = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < numCasos; i++) {
			System.out.println("Digite a linha de texto:");
			String linha = scanner.nextLine();
			String resultado = desembaralharLinha(linha);
			System.out.println(resultado);
		}
	}

	public static String desembaralharLinha(String linha) {
		int tamanho = linha.length();
		StringBuilder sb = new StringBuilder(tamanho);

		for (int i = tamanho / 2 - 1; i >= 0; i--) {
			sb.append(linha.charAt(i));
		}

		for (int i = tamanho - 1; i >= tamanho / 2; i--) {
			sb.append(linha.charAt(i));
		}

		return sb.toString();
	}
}
