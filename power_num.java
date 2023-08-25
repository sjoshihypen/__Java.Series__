package Numbers;
import java.util.*;
public class power_num {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Base  Number Here : ");
        int x = sc.nextInt();
        System.out.println("Enter The Power Number Here : ");
        int n = sc.nextInt();
        int result = power(x, n);

        System.out.println("The Power Of " + x + " Raised To " + n + " Is " + result);
        sc.close();
    }
}