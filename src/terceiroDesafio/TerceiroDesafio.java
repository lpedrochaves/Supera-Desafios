package terceiroDesafio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TerceiroDesafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do array:");
        int n = scanner.nextInt();

        System.out.println("Digite o valor de K:");
        int k = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o elemento " + (i + 1) + " do array:");
            arr[i] = scanner.nextInt();
        }

        int resultado = contarPares(arr, k);
        System.out.println("O número de pares cuja diferença é " + k + " é: " + resultado);
    }

    public static int contarPares(int[] arr, int k) {

        Map<Integer, Integer> frequencia = new HashMap<>();
        for (int num : arr) {
            frequencia.put(num, frequencia.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        for (int num : arr) {
            int complemento = num - k;
            if (frequencia.containsKey(complemento)) {
                count += frequencia.get(complemento);
            }
        }

        return count;
    }
}
