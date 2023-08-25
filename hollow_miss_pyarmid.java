public class hollow_miss_pyarmid {
	public static void main(String[] args) 
	{
		int n = 5;
		int row = 1;
		int nst = 5;
		while(row <= n) 
		{
			int cst = 1;
			while(cst <= nst) 
			{
				if (row == 1 || row == 5) 
				 {
					System.out.print("*  ");
				 } 
				else 
				{
					if (cst == 1 || cst == 5) 
					{
						System.out.print("*  ");
					}
					else
					{
						System.out.print("   ");
					}
				}
				cst++;
			}
			System.out.println();
			row++;
		}	
   }
}
