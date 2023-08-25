package Numbers;
import java.util.Scanner;
public class binary_decimalnum {
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter The Number Here : ");
       int n = sc.nextInt();
       int ans = 0;
       int mul = 1;
       
       while(n > 0) 
       {
    	   int rem = n % 10;
    	   ans = ans + (rem * mul);
    	   mul = mul * 2;
    	   n = n / 10;
       }
       System.out.println(ans);
	sc.close();
}
}
