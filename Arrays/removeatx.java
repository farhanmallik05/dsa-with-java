package Arrays;
import java.util.Scanner;   

public class removeatx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        System.out.println("Enter the position of the element to be removed:");
        int pos = sc.nextInt();

        if (pos < 0||pos >= n) {
            System.out.println("Invalid position");
            return;
        }

        int[] newArr=new int[n - 1];

        for (int i =0; i<pos; i++) {
            newArr[i] = arr[i];
        }

        for (int i = pos+1; i < n; i++) {
            newArr[i-1] = arr[i];
        }

        System.out.println("Array after removal:");
        for (int i=0; i<newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}