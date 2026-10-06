import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=n;i>=1;i--) {

            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            for (int j=1;j<=2*(n-i);j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=2;i<=n;i++) {

            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            for (int j=1;j<=2*(n-i);j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
