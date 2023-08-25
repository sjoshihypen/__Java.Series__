public class left_half_pyarmid {
    public static void main(String[] args){
         int n  = 5;
         int row = 1;
         int nst = 1;
         int nsp = n-1;

         while(row <= n){
            //star print
            int cst = 1;
            while(cst <= nst)
            {
                System.out.print("* ");
                cst++;
            }
            //space print 
            int csp = 1;
            while(csp <= nsp)
            {
                System.out.println(" ");
                csp++;
            }
            row++;
            nst++;
            nsp--;
         }
    }
}

