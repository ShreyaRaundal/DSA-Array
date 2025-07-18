import java.util.Scanner;
public class ArrayInput {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the array size");
        int size=sc.nextInt();

        int[]ar=new int[size];

        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }

        System.out.println("You Entered");
        for(int i=0;i<ar.length;i++){
            System.out.println(i+":"+ar[i]);
        }


    }
}
