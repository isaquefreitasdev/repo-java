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

    }
}
