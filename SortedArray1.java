
public class SortedArray1 {
    static boolean arraySortedOrNot(int a[],int n){
        if(n==1 || n==0){
            return true;
        }
        return a[n-1]>=a[n-2] && arraySortedOrNot(a, n-1);
    }
    public static void main(String[] args){
        int arr[]={29,34,23,4,67,48};
        int n=arr.length;

        if(arraySortedOrNot(arr, n))
        System.out.println("Yes");
        else
        System.out.println("No");

    }
}
