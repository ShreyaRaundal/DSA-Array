public class MinElement {
    public static int minElement(int[]arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }    
        }
        return min;
    }
    public static void main(String[] args) {
        int[]arr={2,3,4,5,6,7};
        System.out.println(minElement(arr));
    }
}
