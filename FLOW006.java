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
	     
	     int a = sc.nextInt();
	     int b = Integer.toString(a).length();
	     int e = 0;
	     for (int j=0; j < b ; j++ )
	     {
	         int d = a%10;
	         a=a/10;
	         
	         e=e+d;
	        
	         
	     }
	        System.out.println(e);
	    }
	}
}
