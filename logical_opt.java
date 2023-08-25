public class logical_opt {
    public static void main(String[] args){
        int a = 40;
        int b = 20;
        int c = 30;

        //same logical && (AND) and logical || (OR)
        System.out.println(a  > b &&  a < c);
        System.out.println(a > b ||  a < c);
       
       //same bitwise & (AND) and bitwise | (OR)
        System.out.println(a  > b &  a < c);
        System.out.println(a > b |  a < c);
    }
}
