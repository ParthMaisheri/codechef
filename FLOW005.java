/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		
		for (int i = 0 ; i < v ; i++)
		{
		    int a ,b=0,c=0;
		    a =sc.nextInt();
		    if (a >= 100)
		    {
		        c = a / 100;
		        a =a % 100;
		        b  = c + b;
		        
		    }
		    if (a >= 50)
		    {
		        c = a /50;
		        a =a % 50;
		        b  = c + b;
		        
		    }
		     if (a >= 10)
		    {
		        c = a /10;
		        a =a % 10;
		        b  = c + b;
		        
		    }
		     if (a >= 5)
		    {
		        c = a /5;
		        a =a % 5;
		        b  = c + b;
		        
		    }
		     if (a >= 2)
		    {
		        c = a /2;
		        a =a % 2;
		        b  = c + b;
		        
		    }
		     if (a >= 1 )
		    {
		        c = a /1;
		        a =a % 1;
		        b  = c + b;
		        
		    }
		    
		    System.out.println(b);
		}
		
	}
}
