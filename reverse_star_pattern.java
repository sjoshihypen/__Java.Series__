public class reverse_star_pattern{
	public static void main(String[] args) 
	{
		int n = 5;
		int row = 1;
		int nst = 9;
		int nsp = 0;
		while(row <= n){
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print("  ");
				csp++;
			}
			int cst = 1;
			while(cst <= nst)
			{
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
			nsp++;
			nst-=2;
		}
	}
}
