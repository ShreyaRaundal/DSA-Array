public class CopyArray {
    public static void main(String[]args){
        int[] arr={1,2,3,4,5};
        int[] dup=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            dup[i]=arr[i];
        }
            for(int i=0;i<dup.length;i++){
            System.out.println(dup[i]);
        }
    } 
}
