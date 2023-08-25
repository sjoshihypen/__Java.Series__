package Numbers;

import java.util.Scanner;

public class reverse_num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int ans = 0;
        int pos = 1;
        while (n > 0) {
            int rem = n % 10;
            ans += pos * Math.pow(10, rem - 1);
            n = n / 10;
            pos++;
        }
        System.out.println("The reversed number is: " + ans);
        sc.close();
    }
}