import java.util.*;
public class simple_interest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Principle Amount : ");
        int principle = sc.nextInt();
        System.out.println("Enter The Interest Rate  : ");
        float rate = sc.nextFloat();
        System.out.println("Enter The Time Period : ");
        int time = sc.nextInt();

        float si  = (principle * rate * time) / 100;

        System.out.println("The Simple Interest Calculated : " + si);
        // If not close scanner class  Resource leak: 'sc' is never closedJava(536871799)
        sc.close(); // close the scanner
    }
}