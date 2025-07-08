package Ecommerce;

public class Product {
    String name;
    double price;
    int stack;
    int id;

    public Product(String name,double price,int stack,int id){
        this.name=name;
        this.price=price;
        this.stack=stack;
        this.id=id;
    }

    @Override
    public String toString(){
        return "[Name = "+name +",Price ="+ price +",Stack="+stack+"ID = "+id+"]";

    }
}
