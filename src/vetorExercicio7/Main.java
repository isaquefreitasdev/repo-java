package vetorExercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] N = new double[n];
        System.out.printf("Digite a quantidade de numeros a serem digitados");
        // adicionando os elementos no vetor
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            double valores = sc.nextDouble();
            N[i] = valores;
        }
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
                soma += N[i];

        }
        double media = soma/n;

        for (int i = 0; i < n; i++) {
            System.out.println("Valores:" + N[i]);

        }
        System.out.println(soma);
        System.out.println(media);
    }
}
