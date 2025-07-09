import java.util.Arrays;

public class HalfReverse {
    public static void main(String[] args) {
        int[] ar = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(ar));
    }

    public static int[] haalfRev(int[] ar) {
        int[] ans = new int[ar.length];
        for (int i = 0, j = ar.length - 1; i < ar.length; i++) {
            if (i < ar.length / 2) {
                ans[i] = ar[i];      // Copy first half as-is
            } else {
                ans[i] = ar[j];      // Reverse second half
                j--;
            }
        }
        return ans;
    }
}
