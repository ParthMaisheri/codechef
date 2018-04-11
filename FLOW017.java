/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    Scanner sc = new Scanner (System.in);
	    int v = sc.nextInt();
	    
	    for (int i =0 ; i< v ; i++)
	    
	    {
	        
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        
	        if (a > b && a < c || a > c && a < b )
	        {
	            System.out.print(a+"\n");
	        }
	        else if (b > a && b < c || b > c && b < a)
	        {
	            System.out.print(b+"\n");
	        }
	        else if (c > b && b < a || c < b && b > a)
	        {
	            System.out.print(c+"\n");
	        }
	        
	    }
	    
	}
}
