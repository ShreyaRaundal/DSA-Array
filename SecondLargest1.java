import java.util.Arrays;
public class SecondLargest1 {
    static int getsecondlargest(int[] arr){
        int n=arr.length;
//  largest element 
        int largest=-1,secondlargest=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>largest)
            largest=arr[i];
        }

        // second largest
        for(int i=0;i<n;i++){
            if(arr[i]!=largest && arr[i]>secondlargest){
                secondlargest=arr[i];

            }
        }
        return secondlargest;

    }
    public static void main(String[] args){
        int arr[]={3,4,5,68,8};
        System.out.println(getsecondlargest(arr));

    }
}
