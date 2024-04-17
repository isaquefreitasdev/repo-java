package Exerciciowhile3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcool =0;
        int gasolina = 0;
        int diesel = 0;
        int tipo;
        tipo = sc.nextInt();
        while(tipo != 4){
            if (tipo == 1){
                alcool = alcool +1;
            }
            if (tipo == 2){
                gasolina = gasolina + 1;

            }
            if (tipo == 3){
                diesel = diesel + 1;
            }
            tipo = sc.nextInt();

        }
        System.out.println("Muito obrigado!");
        System.out.printf("alcool: %1d%ngasolina: %2d%ndiesel: %3d%n",alcool,gasolina,diesel);
    }
}
