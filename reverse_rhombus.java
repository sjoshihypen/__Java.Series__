public class reverse_rhombus {
    public static void main(String[] args){
        int n = 6;
        int row = 1;
        int nst = 1;
        int nsp = 10;
 
        while(row <= n)
        {
            //print space
            int csp = 1;
            while(csp <= nsp){
                System.out.print("  ");
                csp++;
            }
            //print star
            int cst = 1;
            while(cst <= nst){
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            row++;
            nsp-=2;
            nst++;
        }
    }
}