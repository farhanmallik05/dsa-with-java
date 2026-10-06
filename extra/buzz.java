import java.util.Scanner;
public class buzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num1=sc.nextInt();
        if ((num1%7==0)||(num1%10==7)) {
            System.out.println("buzz number");
        }
        else
        {
            System.out.println("not a buzz number");
        }
        sc.close();
    }
}
