public class ThirdMaxElement {
    public static int thirdMaxElement(int[]arr){
        int max=Integer.MIN_VALUE;
        int SecMax=Integer.MIN_VALUE;
        int ThirdMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }else if(arr[i] > SecMax && arr[i]!=max){
                SecMax=max;
                max=arr[i];

            }else if(arr[i] > ThirdMax && arr[i]!=SecMax && arr[i]!=ThirdMax){
                ThirdMax=SecMax;
                SecMax=max;
                max=arr[i];
            }
        }
        return ThirdMax;
    }
    public static void main(String[]args){
        int arr[]={8,6,11,18,0,6};
        System.out.println(thirdMaxElement(arr));

    }
}
