import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp1 = n/2;
        int sp2 = -1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1;j<=sp1; j++){
                System.out.print("\t");
            }
            System.out.println("\t");
            for (int j = 1;j<=sp2; j++){
                System.out.print("*\t");
            }
            System.out.println();
            if (i!=1&& i !=n) {
                System.out.print("*\t");
            }
            if (i<= n/2) {
                sp1--;
                sp2 +=2;
            }else{
                sp1++;
                sp2-=2;
            }
            System.out.println();
        }
    }
}