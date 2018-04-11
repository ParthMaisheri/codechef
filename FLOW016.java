/* package whatever; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a ;
		Scanner sc = new Scanner(System.in);
		a =  sc.nextInt();
		long b,c,d,gcd;
		for(int i=0 ; i<a ; i++)
		{
		     gcd = 1;
			 b = sc.nextLong();
			 c = sc.nextLong();
		
			d =  b * c;
			
			         while(c != b)
             {
            if(b > c)
                b -= c;
            else
                c -= b;
                }
                    
			 
			 
			System.out.println(c + " "+ d/c);
		}
	}
}
