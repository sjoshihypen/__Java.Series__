import java.util.*;
public class greater_num {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The 1st Number Here :  ");
        int a = sc.nextInt();
        System.out.println("Enter The 2nd Number Here :  ");
        int b = sc.nextInt();
        System.out.println("Enter The 3rd Number Here :  ");
        int c = sc.nextInt();
        
    
        if(b < a || c < a){
            System.out.println("Print Number A Is Greatest .");
        }
        else if(a < b || c < b ){
        System.out.println("Print Number B Is Greatest .");
        }
        else{
        System.out.println("Print Number C Is Greatest .");
        } 
        sc.close();
    }
}
