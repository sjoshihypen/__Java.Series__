package Numbers;
import java.util.*;
public class plaindrome_num {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter A Number Here : ");
        int number = sc.nextInt();

        int rev_num = 0;
        int originalNumber = number;

        while (number != 0) {
            int digit = number % 10;
            rev_num = rev_num * 10 + digit;
            number /= 10;
        }

        if (originalNumber == rev_num) {
            System.out.println("The Number Is A Palindrome.");
        } else {
            System.out.println("The Number Is Not A Palindrome.");
        }
        sc.close();
    }
}