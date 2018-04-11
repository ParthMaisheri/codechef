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
	    int v  = sc.nextInt();
	    int count =0,count2=0;
	    int a[] = new int[v];
	    
	    for (int i = 0 ; i < v ;i++)
	        {
	            a[i] = sc.nextInt();
	        }
	   for (int j=0 ; j < v ; j++)
	        {
	            if (a[j]%2 == 0)
	            {
	                count++;
	            }
	            else 
	            count2++;
	        }
	   if (count > count2  )
	   System.out.println("READY FOR BATTLE");
	   
	   else
	   System.out.println("NOT READY");
	    
	}  
	
}
