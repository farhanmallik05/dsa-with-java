import java.util.*;
public class factorial {
    public static int Factorial(int n)
    {
        if(n<=0||n==1){
            return 1;
        }
        return n*Factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = Factorial(n);
        System.out.println(result);
    }
}
