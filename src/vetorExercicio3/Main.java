package vetorExercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vetor = new int[n];

        int qtdPares = 0;
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            int values = sc.nextInt();
            vetor[i] = values;
        }
        for (int i = 0;i < n;i++){
            if (vetor[i] % 2 == 0){
                System.out.println("Números pares: " + vetor[i]);
                qtdPares++;
            }

        }
        System.out.println("Quantidade de Pares : " + qtdPares);
    }
}
