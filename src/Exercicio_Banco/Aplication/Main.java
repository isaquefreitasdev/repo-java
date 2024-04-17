package Exercicio_Banco.Aplication;

import Exercicio_Banco.Entites.BankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Conta: ");
        int conta = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Deposito inicial?s/n: ");
        String ask = sc.nextLine();
        double initial = 0;
        if (ask.equals("s")){
            System.out.print("Valor inicial:");
            initial = sc.nextDouble();
        }else{
            initial = 0;
        }
        BankAccount bank = new BankAccount(conta,nome,initial);
        System.out.println(bank.getNumberAccount());
        System.out.println(bank.getNameUser());
        System.out.println(bank.getDepositValue());

        System.out.println();
        System.out.print("Valor do depósito: ");
        double valorDep = sc.nextDouble();
        bank = new BankAccount(conta,nome, bank.addMoneyInAccount(valorDep));
        System.out.println(bank.getNumberAccount());
        System.out.println(bank.getNameUser());
        System.out.println(bank.getDepositValue());
        System.out.println();

        System.out.print("Valor do saque: ");
        double saque = sc.nextDouble();
        bank = new BankAccount(conta,nome,bank.removeAccount(saque));

        System.out.println(bank.getNumberAccount());
        System.out.println(bank.getNameUser());
        System.out.println(bank.getDepositValue());



    }
}
