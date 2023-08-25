package Numbers;
import java.util.*;
public class product_num {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Number Here Which You Want To Print Table Of : ");
    int n = sc.nextInt();
    
    for(int i= 1;i <= 10;i++){
        System.out.println(n + " x "+ i  + " = " + n * i);
    }
    sc.close();
    }
}
