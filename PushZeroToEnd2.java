public class PushZeroToEnd2 {
    static void pushZeroToEnd(int[] arr){
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while(count<arr.length){
            arr[count++]=0;
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,0,4,6,0,0,0};
        pushZeroToEnd(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
