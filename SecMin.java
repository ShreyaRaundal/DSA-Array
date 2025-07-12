public class SecMin {
    public static int secMin(int[]arr){
        int min=Integer.MAX_VALUE;
        int secMin=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                secMin=min;
                min=arr[i];
            }else if(arr[i]<secMin && arr[i]!=min){
                secMin=arr[i];
            }
        }
        return secMin;
    }
    public static void main(String[] args) {
        int[]arr={1,3,55,6,7,24};
        System.out.println("Second Min : "+secMin(arr));
    }
}
