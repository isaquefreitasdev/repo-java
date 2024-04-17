package exercicio3poo.aplication;

import exercicio3poo.entities.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Digite seu nome:");
        student.name = sc.nextLine();
        System.out.println("Digite suas notas: ");
        student.n1 = sc.nextDouble();
        student.n2 = sc.nextDouble();
        student.n3 = sc.nextDouble();

        System.out.println("Final GRADE: " + student.Soma());
        student.AnswerPass();
    }
}
