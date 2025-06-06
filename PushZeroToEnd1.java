import java.util.Arrays;
public class PushZeroToEnd1 {
    static void pushZeroToEnd(int[] arr){
        int n=arr.length;
        int[] temp=new int[n];

        int j=0;

        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                 temp[j++]=arr[i];
            }
           
        }

        while (j<n) {
            temp[j++]=0;
            
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,0,3,0,5,0,0,0};
        pushZeroToEnd(arr);
        for(int  num:arr){
            System.out.print(num+" ");
        }
    }
}
