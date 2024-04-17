package Exercicio_Banco.Entites;

public class BankAccount {
    private int numberAccount;
    private String nameUser;
    private double depositValue = 0.0;
    public BankAccount(int numberAccount,String nameUser,double depositValue){
        this.numberAccount = numberAccount;
        this.nameUser = nameUser;
        this.depositValue = depositValue;
    }

    public String getNameUser() {
        return nameUser;
    }

    public double getDepositValue() {
        return depositValue;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public double addMoneyInAccount(double moneyAccount) {
        return this.depositValue + moneyAccount;
    }

    public double removeAccount(double valueSac) {
        return depositValue - 5 - valueSac;
    }
}
