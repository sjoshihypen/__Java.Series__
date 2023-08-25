public class star_pattern {
	public static void main(String[] args) 
	{
		int n = 5;
		int row  = 1;
		while(row <= n) 
		{
			int cst = 1;
			while(cst <= n) 
			{
			if(cst == row || cst == (n - row +1 )) 
		       System.out.print("* ");
			else 
			
			   System.out.print("  ");
		       cst++;
		}
			System.out.println();
			row++;
     }
   }
}
   