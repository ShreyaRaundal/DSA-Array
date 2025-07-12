public class SecondMaxElement {
    public static int secondMaxElement(int[]arr){
        int max=Integer.MIN_VALUE;
        int SecMax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                SecMax=max;
                max=arr[i];

            }else if(arr[i]<SecMax && arr[i]!=max){
                SecMax=arr[i];
            }
        }
        return SecMax;
       
    }
    public static void main(String[]args){
        int[]arr={2,3,3,4,55,6,6};
        System.out.println(secondMaxElement(arr));

    }
        
}
