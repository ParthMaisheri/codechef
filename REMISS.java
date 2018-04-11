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
	        String a ;
	        a = sc.next();
	        a += sc.nextLine();
	        //System.out.println(a);
	        String[] b = a.split(" ");
	        
	        
	        
	        String x = b[0];
		    String y = b[1];
            int c = Integer.parseInt(x);
	        int d = Integer.parseInt(y);
	        int e = c+d;
	        if (c > d )
	        {
	        
	        System.out.println(c+" "+e);
	        }
	        else if (d > c)
	        {
	          System.out.println(d+" "+e);  
	        }
	       /* int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = a+b;
	        
	        System.out.print(a+" "+c);*/
	        
	        
	    }
 
	}
}
