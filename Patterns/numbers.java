import java.util.*;
public class numbers {
    public static void main(String[] args) {
        int num = 3;
        int count = 5;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(num + " ");
            }
            System.out.println();
             num++;
             count--;
        }

    }
}

