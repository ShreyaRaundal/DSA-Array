public class SorrtedArray {
    static boolean arraySortedOrNot(int arr[],int n){
        if(n==0 || n==1){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        int arr[]={20,19,14,23,56};
        int n=arr.length;

        if(arraySortedOrNot(arr,n))
        System.out.println("Yes");
        else
        System.out.println("No ");

    }
}
