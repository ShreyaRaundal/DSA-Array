public class AccessArray {
    public static void main(String[] args){

        // Access the element
        int arr[]={1,2,3,4,5};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        // ArrayOutOfboundException
        System.out.println(arr[5]);
        
        // NullpointerException
        int[] a = null;
        System.out.println(a.length);

        int[]aa={};
        System.out.println(aa.length);




    }
}
