import java.util.Scanner;

public class demo{
    public static void main(String [] args){
        //Scanner sc = new Scanner(System.in);
        int n = 5;
        int sp = 1;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1;j<=st; j++){
                System.out.println("*\t");
            }
            for (int j = 1;j<=sp; j++){
                System.out.println("\t");
            }
            for (int j = 1;j<=st; j++){
                System.out.println("*\t");
            }
            if (i<= n/2) {
                sp+=2;
                st--;
            }else{
                sp-=2;
                st++;
            }
            System.out.println("\n");
        }
    }
}