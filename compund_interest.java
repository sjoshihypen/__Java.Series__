import java.util.Scanner;
public class compund_interest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter The Interest Rate: ");
        double interestRate = sc.nextDouble();

        System.out.print("Enter The Time Period: ");
        int years = sc.nextInt();

        double ci = principal * Math.pow(1 + interestRate / 100, years);

        System.out.println("The Compound Interest is $ " + ci);

        sc.close(); // close the scanner
}
}