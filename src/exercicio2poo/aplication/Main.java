package exercicio2poo.aplication;

import exercicio2poo.entities.Employee;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.print("Nome: ");
        employee.name = sc.nextLine();
        System.out.print("Salario Bruto: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Imposto: ");
        employee.tax = sc.nextDouble();

        System.out.printf("Nome:%s%nSalario Liquido:%.2f%n",employee.name,employee.NetSalary());
        System.out.println();
        System.out.print("Percentual a ser dado de aumento:");
        double percentage = sc.nextDouble();
        employee.IncreaseSalary(percentage);
        System.out.println("O salário com aumento é: " + employee.NetSalary());

    }
}
