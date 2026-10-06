import java.util.*;
public class insertion_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of an array");
        int[] wow = new int[sc.nextInt()];
        System.out.println("enter your input");
        for (int i = 0; i < wow.length; i++) {
            wow[i] = sc.nextInt();
        }
        for (int i = 1; i < wow.length; i++) {
            int key = wow[i];
            int j = i - 1;
            while (j >= 0 && wow[j] > key) {
                wow[j + 1] = wow[j];
                j--;
            }
            wow[j + 1] = key;
        }
        System.out.println("sorted array:-");
        for (int i = 0; i < wow.length; i++) {
            System.out.print(wow[i] + " ");
        }
    }
}
