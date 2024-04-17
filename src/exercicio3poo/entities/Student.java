package exercicio3poo.entities;

public class Student {
    public String name;
    public double n1;
    public double n2;
    public double n3;

    public double Soma(){
        return n1 + n2 + n3;
    }
    public void AnswerPass(){
        if (Soma() >=60){
            System.out.println("PASS");

        }else {
            System.out.println("Failed");
            double missing = 60 - Soma();
            System.out.println("Faltaram: " + missing);
        }
    }

}
