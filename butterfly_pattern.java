public class butterfly_pattern {
	public static void main(String[] args) 
	{
		int n = 5;
		int row = 1;
		int nst = 1;
		int nsp = 2 * n - 3;
		
		while(row <= n)
		{
			// Star Print
			
			int cst = 1;  
			while(cst <= nst)
			{
				System.out.print("*  ");
			    cst++;
			}
			
			// Space Print
			
			int csp = 1;  
			while(csp <= nsp)
			{
				System.out.print("   ");
			    csp++;
			}
			
			   // Doubt
			// Star Print
			
			cst = 1;
			if(row == n) 
			{
				cst = 2;
			}
			 while(cst <= nst) 
			 {
				System.out.print("*  ");
				 cst++;
			 }
			System.out.println();
			nsp-=2;
			row++;
			nst++;
		}
		
		 n   = 5;
		 nst = 5;
		 nsp = 2 * n - 11;
		 row = 1;
		
		while(row <= n) 
		{
		    // Stars Print
			int cst = 1;
		    while(cst <= nst)
		    {
			  System.out.print("*  ");
			  cst++;
		    }
		    // Spaces Print
		    int csp = 1;
		    while(csp <= nsp)
		    {
			 System.out.print("   ");
			 csp++;
		    }
		 
		    if(row == 1) 
		    {
			 int ncst = 2;
			 while(ncst <= nst){
			 	System.out.print("*  ");
			 	ncst++;
		 	  }
		    }
		    else{  
			int ncst = 1;
			// Stars Print
		 	while(ncst <= nst){
				 System.out.print("*  ");
				 ncst++;
		 	}
		} 
		   System.out.println();
           nst--;
		   nsp+=2;
		   row++;
		}
	}
}
