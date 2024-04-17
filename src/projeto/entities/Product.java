package projeto.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double TotalValueinStock(){
        return price * quantity;
    }
    public void AddProducts(int quantity){
        this.quantity += quantity;
    }
    public void RemoveProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return String.format("Name:%s%nPrice:%.2f%nQuantity:%d%nTotal:%.2f",name,price,quantity,TotalValueinStock());
    }
}
