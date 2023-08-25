public class left_reverse_pyaramid {
    public static void main(String[] args){
        int n = 5;
        int row = 1;
        int nst = 5;
        int nsp = 0;
        
        while(row<=n){
            int cst = 1;
            while(cst <= nst){
                System.out.print("*  ");
                cst++;
            }
            int csp = 1;
            while(csp >= nsp){
                System.out.println("  ");
                csp--;
            }
            System.out.println();
            nst--;
            nsp++;
            row++;
        }
    }
}
