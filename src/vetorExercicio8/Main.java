package vetorExercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos valores serao adicionados ao vetor:");
        int n = sc.nextInt();
        int[] N = new int[n];
        // Entrada de valores no vetor
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            int valores = sc.nextInt();
            N[i] = valores;
        }
        // Soma dos VALORES e verificação se é par
        int soma = 0;
        int media = 0;
        int qtdPares = 0;
        boolean verifique = false;
        for (int i = 0; i < n; i++) {

            if (N[i] % 2 == 0) {
                soma += N[i];
                verifique = true;
                qtdPares++;
            }
        }
        if (verifique == true) {
            media = soma / qtdPares;
            System.out.println(media);
        } else {
            System.out.println("Nenhum par foi encontrado.");
        }

    }
}
