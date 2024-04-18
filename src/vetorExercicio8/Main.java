package vetorExercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] N = new int[n];
        System.out.println("Digite quantos valores serao adicionados ao vetor:");
        // Entrada de valores no vetor
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            int valores = sc.nextInt();
            N[i] = valores;
        }
    }
}
