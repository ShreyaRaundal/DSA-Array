import java.util.Arrays;
public class RotateArray3 {
    static void rotateArr(int[] arr,int d){
        int n=arr.length;
        
        d%=n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

    }
    static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;

        rotateArr(arr, n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
