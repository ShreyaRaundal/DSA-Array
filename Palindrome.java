public class Palindrome {
    public static boolean checkPalindrome(int[]ar){
        int i=0;
        int j=ar.length-1;
        while(i<j){
           if(ar[i]==ar[j]){
            i++;
            j--;
           }else{
            break;
           }
           return true;
        }
        
    }
    public static void main(String[] args){
        int[]arr={1,2,3,4,5,6};
        System.out.println(checkPalindrome(arr));

    }
}
