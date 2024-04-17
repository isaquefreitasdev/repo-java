package Exercicio4for;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();

        for(int i=0; i < N;i++){
            int n1,n2;
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            if (n2 == 0 || n1 == 0){
                System.out.println("Divisao impossivel");
            }else{
                System.out.println(n1/n2);
            }
        }
    }
}
