package PrimitiveArray;

public class Student {
    String name;
    String coll;
    int age;
    int id;

    public Student(){}

    public Student(String name,String coll,int age,int  id){
        this.name=name;
        this.coll=coll;
        this.age=age;
        this.id=id;
    }
    @Override
    public String toString(){
        return"[name" + name + ",coll = " + coll + ",age = " + age + ",id = " +id+"]";
     }
}