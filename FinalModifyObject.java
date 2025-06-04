public class FinalModifyObject {

    int p=20;
    public static void main(String[] args){
        final  FinalModifyObject t=new FinalModifyObject();
        t.p=80;
        System.out.println(t.p);
    }
}
