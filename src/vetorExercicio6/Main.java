package vetorExercicio6;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número de elementos do vetor:");
        int n = sc.nextInt();
        double[] N = new double[n];

        // adicionando os elementos no vetor
        System.out.println("Informe os elementos do vetor:");
        for (int i = 0; i < n; i++) {
            N[i] = sc.nextDouble();
        }

        // Calculando a média do vetor
        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += N[i];
        }
        double media = soma / n;

        System.out.printf("Média do vetor = %.3f%n", media);
        System.out.println("Elementos abaixo da média:");
        for (int i = 0; i < n; i++) {
            if (N[i] < media) {
                System.out.printf("%.2f%n", N[i]);
            }
        }
    }
}
