package vetorExercicio5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos valores os vetores terão?");
        int nElementos = sc.nextInt();
        int[] vetorA = new int[nElementos];
        int[] vetorB = new int[nElementos];
        // vetor A valores
        System.out.println("Valores do A:");
        for (int i = 0; i < nElementos; i++) {
            sc.nextLine();
            int valores = sc.nextInt();
            vetorA[i] = valores;
        }

        System.out.println("Valores do B:");
        // vetor B valores
        for (int i = 0; i < nElementos; i++) {
            sc.nextLine();
            int valores = sc.nextInt();
            vetorB[i] = valores;
        }
        // soma dos valores correspondentes dos vetores
        // para gerar um novo vetor
        int[] somaVetores = new int[nElementos];
        for (int i = 0; i < nElementos; i++) {
            somaVetores[i]  = vetorA[i] + vetorB[i];
        }
        // exibir vetor C com a soma dos valores
        System.out.println("Os valores do vetor c são: ");
        for (int i = 0; i < nElementos; i++) {

            System.out.println(somaVetores[i]);
        }
    }
}
