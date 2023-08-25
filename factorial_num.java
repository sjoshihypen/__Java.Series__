package Numbers;
import java.util.*;
public class factorial_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Here : ");
        int n = sc.nextInt();
        int fact = n * (n - 1);
        
        System.out.println("Factorial Of Number : " + fact);       
        sc.close();
    }
}
