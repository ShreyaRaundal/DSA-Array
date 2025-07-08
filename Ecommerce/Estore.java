package Ecommerce;

public class Estore {
    public static void main(String[]args){
        Product[] catalog=new Product[5];

        catalog[0]=new Product("Laptop",50000,10,101);
        catalog[1]=new Product("Mobile",20000,20,102);
        catalog[2]=new Product("Headphones",3000,50,103);

        for(int i=0;i<catalog.length;i++){
            if(catalog[i]!=null){
                System.out.println(catalog[i]);
            }
        }

    }
    
}
