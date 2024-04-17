package vetorExercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            int valores = sc.nextInt();
            vetor[i] = valores;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(vetor[i]);
        }
        int soma = 0;
        for (int i = 0; i < n;i++ ){
            soma+=vetor[i];
        }
        System.out.println(soma);
        int media = soma / n;
        System.out.println(media);
    }
}
