import java.util.Scanner;

public class hcflcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int on1 = n1;
        int on2 = n2;
        while (n1 % n2 > 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        System.out.println("HCF: " + n2);
        System.out.println("LCM: " + (on1 * on2) / n2);
        
    }
}
