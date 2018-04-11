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
		int v =sc.nextInt();
		
		for (int i = 0 ; i < v ; i++)
		{
		   String[] a = new String[4];
		   String[] b = new String[4];
		   int count =0;
		   
		   for(int j=0 ; j < 4 ; j++)
		   {
		       a[j]=sc.next();
		   }
		   for(int j=0; j < 4;j++)
		   {
		       b[j]=sc.next();
		   }
		    
		    for (int j=0 ; j < 4 ; j++)
		            {
		                for(int k=0; k<4; k++)
		                {
		                    if (a[j].equals(b[k]))
		                    {   //System.out.println(a[j]+" "+b[k]);
		                        count++;
		                    }
		                    
		                }
		            }
		if (count >= 2 )
		System.out.println("similar");
		else
		System.out.println("dissimilar");
		//count = 0;
		    
		}
	}
}
