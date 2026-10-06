import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int org = n;
        int sum = 0;
        int count = 0;
        while (n != 0) {
            int rem = n % 10;
            count++;
        }
        while(n!=0){
            int rem = n%10;
            sum+=Math.pow(rem,count);
            n = n/10;

        }
        System.out.println(sum);
    }
}
