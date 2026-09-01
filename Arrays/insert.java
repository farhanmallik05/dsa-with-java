package Arrays;
import java.util.Scanner;

public class insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        System.out.println("Enter the element to be inserted:");
        int x = sc.nextInt();
        System.out.println("Enter the position where the element is to be inserted:");
        int pos = sc.nextInt();

        int[] newArr = new int[n + 1];

        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        newArr[pos] = x;

        for (int i = pos; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.println("Array after insertion:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
