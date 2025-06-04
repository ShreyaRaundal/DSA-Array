
// Arrays of Objects

class Student{
    public int rollno;
    public String name;

    Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;

    }
}

public class ArrayOFObject{

    public static void main(String[] args){

        Student arr[]=new Student[5];

        arr[0]=new Student(1,"Shree");
        arr[1]=new Student(2,"Sam");
        arr[2]=new Student(3,"Ganesh");
        arr[3] = new Student(4, "Dharmesh");
        arr[4] = new Student(5, "Mohit");

        for(int i=0;i<5;i++){
            System.out.println("Element at " + i + " : { "+ arr[i].rollno + " "+ arr[i].name+" }");
        }

    }
}