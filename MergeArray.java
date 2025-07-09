import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40,50,60};
        int[] arr2 = {70,80,90,100};
        System.out.println(Arrays.toString(mergeArray(arr1, arr2)));
    }

    public static int[] mergeArray(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length + arr2.length];

        for (int i = 0; i < ans.length; i++) {
            if (i < arr1.length) {
                ans[i] = arr1[i];
            } else {
                ans[i] = arr2[i - arr1.length];
            }
        }

        return ans;
    }
}
