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
		
		for (int i = 0 ; i < v ; i++ )
		
		{
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = 0 ;
		    int d = 0;
		    for (int j =0; j < a;j++)
		    {
		        for (int k = 1 ; k <= b ; k++)
		        {
		            c = c + k ;
		        }
		        b=c;
		        d =c;
		        c=0;
		        
		    }
		    System.out.println(d);
		}
		
	}
}
