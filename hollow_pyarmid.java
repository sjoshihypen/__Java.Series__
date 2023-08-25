public class hollow_pyarmid {
  
        public static void main(String[] args){
          int n = 5;
          int row = 1;
          int nst = 5;
          while(row <= n) //cond. check 
          {
            int cst = 1;
              while(cst<=nst)
              {
                 System.out.print("*  ");
                 cst++;
              }
          System.out.println(" "); // space print to next line  
          row++; //update value  
          }
    }
}
