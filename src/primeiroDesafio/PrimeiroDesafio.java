package primeiroDesafio;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeiroDesafio {
	public static void main(String[] args) {

		Integer quantidadeDeNumeros;
		Integer numeroDigitado;
		List<Integer> listaPares = new ArrayList<>();
		List<Integer> listaImpares = new ArrayList<>();
		List<Integer> listaConcatenada = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite quantos números serão inseridos: ");
		quantidadeDeNumeros = sc.nextInt();

		for (int i = 0; i < quantidadeDeNumeros; i++) {
			System.out.print("Digite um número: ");
			numeroDigitado = sc.nextInt();
			if (numeroDigitado % 2 == 0) {
				listaPares.add(numeroDigitado);
				Collections.sort(listaPares);
			} else {
				listaImpares.add(numeroDigitado);
				Collections.sort(listaImpares,Collections.reverseOrder());
			}
			listaConcatenada = Stream.concat(listaPares.stream(), listaImpares.stream()).collect(Collectors.toList());
		}
		
		for (Integer item : listaConcatenada) {
			System.out.println(item);
		}
	}
}
