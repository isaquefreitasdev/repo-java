package vetorExercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        double[] age = new double[n];
        double[] height = new double[n];
        // Entrada de valores no Vetor;
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Nome:");
            String nome = sc.nextLine();
            name[i] = nome;
            System.out.println("Idade:");
            double idade = sc.nextDouble();
            age[i] = idade;
            System.out.println("Altura:");
            double altura = sc.nextDouble();
            height[i] = altura;
        }
        //soma de valores com a finalidade de saber a media
        double soma = 0.0;
        double media = 0.0;
        for (int i = 0; i < n; i++) {
            soma += height[i];
        }
        media = soma / n;
        int qtdMenor16 = 0;
        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                qtdMenor16++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                System.out.println(name[i]);
            }
        }
        System.out.println();

    }
}
