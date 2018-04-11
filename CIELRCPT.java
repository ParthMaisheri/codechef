/* package codechef; // don't place package name! */
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
		    if (a >= 2048)
		    {
		        c = a / 2048;
		        a =a % 2048;
		        b  = c + b;
		        
		    }
		    if (a >= 1024)
		    {
		        c = a /1024;
		        a =a % 1024;
		        b  = c + b;
		        
		    }
		     if (a >= 512)
		    {
		        c = a /512;
		        a =a % 512;
		        b  = c + b;
		        
		    }
		     if (a >= 256)
		    {
		        c = a /256;
		        a =a % 256;
		        b  = c + b;
		        
		    }
		     if (a >= 128)
		    {
		        c = a /128;
		        a =a % 128;
		        b  = c + b;
		        
		    }
		     if (a >= 64 )
		    {
		        c = a /64;
		        a =a % 64;
		        b  = c + b;
		        
		    }
		     if (a >= 32 )
		    {
		        c = a /32;
		        a =a % 32;
		        b  = c + b;
		        
		    }
		     if (a >= 16 )
		    {
		        c = a /16;
		        a =a % 16;
		        b  = c + b;
		        
		    }
		     if (a >= 8 )
		    {
		        c = a /8;
		        a =a % 8;
		        b  = c + b;
		        
		    } if (a >= 4 )
		    {
		        c = a /4;
		        a =a % 4;
		        b  = c + b;
		        
		    }
		     if (a >= 2 )
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
