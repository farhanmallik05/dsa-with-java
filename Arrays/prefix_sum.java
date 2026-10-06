import java.util.*;

public class prefix_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] wow = { -3, 6, 2, 4, 5, -2, 8, -9, 3, 1 };
        // int [] wow={1, 1, 1,1 , 1, 1, 1, 1, 1, 1};
        int n = 6;
        int[] a = { 3, 3, 5, 6, 2, 7 };
        int[] b = { 8, 6, 9, 8, 7, 7 };
        // for (int i = 0; i < n; i++) {
        // int sum = 0;
        // for (int j = a[i]; j <= b[i]; j++) {
        // sum += wow[j];
        // }
        // System.out.println("sum " + i + ":- " + sum);
        // sum = 0;
        // }
        int nums[] = new int[wow.length];
        int sum = 0;
        for (int i = 0; i < wow.length; i++) {
            sum =sum+ wow[i];
nums[i] = sum;
        }
        System.out.println("new array is ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
