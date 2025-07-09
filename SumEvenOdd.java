public class SumEvenOdd {
    public static void calculateSum(int[]arr){
        int evenSum=0;
        int oddSum=0;

        for (int value : arr) {
            if (value % 2 == 0) {
                evenSum += value;
            } else {
                oddSum += value;
            }
        }
        System.out.println("Sum of even Number : "+evenSum);
        System.out.println("Sum of Odd Number : "+oddSum);
    }
    public static void main(String[] args){
        int[]arr={10,3,5,8,7,4};
        calculateSum(arr);
    }
}
