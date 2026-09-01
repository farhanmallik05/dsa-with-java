package Arrays;

public class reverse2 {
    //two pointer approach
     public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Reversing the array using two pointers
        int left = 0;
        int right = n - 1;
        while (left < right) {  
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }       

        System.out.println("\nReversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
     }
}
