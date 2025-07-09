import java.util.Arrays;

public class ReverseArrayCopy {
    public static int[] reverseCopy(int[]ar){
        int[]rev=new int[ar.length];
        for(int i=0;i<ar.length;i++){
            rev[ar.length-1-i]=ar[i];

        }
        return rev;
    }
    public static void main(String[]args){
        int ar[]={1,2,3,4,5,6,7};
        int[] ans=reverseCopy(ar);
        System.out.println(Arrays.toString(ans));
    }

}
