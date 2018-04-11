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
		
		for(int i=0 ; i < v ; i++)
		{
		    int a ,d =0 , e = 0 ;
		    a =sc.nextInt();
		    int b = a ; 
		    int c = Integer.toString(a).length();
		    
		    
		    for (int j = 0; j < c ;j++ )
		    {   d = d*10;
		        d = d+a%10;
			
		        a = a/10;
		         
		       
		    }
		    
		    
		    if (b == d)
		    {
		        System.out.println("wins");
		   }
		    else 
		    System.out.println("losses");
		    
		}
		
	}
}
