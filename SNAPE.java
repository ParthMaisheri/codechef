/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc  = new Scanner(System.in);
	    int v = sc.nextInt();
	    
	     for (int i=0 ; i<v ;i++)
	     {
	       int a ,b ,c ,d ;
	       
	       a = sc.nextInt();
	       b = sc.nextInt();
	       
	       c = (b*b)-(a*a);
	       d = (a*a)+(b*b);
	       
	       Double x=Math.sqrt(c);	
    	    float e =x.floatValue();
    	    
    	    System.out.print(e+" ");
    	    
    	     x=Math.sqrt(d);	
    	     e =x.floatValue();
    	     
    	     System.out.print(e+"\n");
            	         
	         
	     }
	     
	     
	     
	}
}
