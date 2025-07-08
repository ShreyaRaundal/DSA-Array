package PrimitiveArray;

public class dp {
    public static void main(String[] args) {
        Student[] db=new Student[5];
        db[0]=new Student("Shreya","DYPatil",21,12345);
        db[1]=new Student("Raju","DYPatil College",23,34565);
        db[2]=new Student("Sam","JSPM",23,34566);
        db[3]=new Student("Sanjita","IIIT",24,2345);
        db[4]=new Student("Anu","SP",21,789);

        for(int i=0;i<db.length;i++){
            System.out.println(db[i]);
        }

    }
}
