public class EvenOddSumCheck {
    public static void CheckEvenOddSum(int[]arr){
        int evenSum=0;
        int oddSum=0;

        for(int value:arr){
            if(value%2==0){
               evenSum+=value;
            }else{
                oddSum+=value;
            }
        }
        System.out.println("Sum of evenNumber : "+evenSum);
        System.out.println("Sum of odd number :"+oddSum);
        if(evenSum==oddSum){
            System.out.println("Even and Odd are Equals");
        }else{
            System.out.println("Even and odd are not equals");
        }


    }
    public static void main(String[]args){
        int arr[]={2,4,3,5};
        CheckEvenOddSum(arr);

    }
}
