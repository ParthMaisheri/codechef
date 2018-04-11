/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new  Scanner(System.in);
	    int v = sc.nextInt();
	    
	    for (int i =0 ; i < v  ; i++)
	    {
	        
	        int a , b ,c ;
	        a =sc.nextInt();
	        b =sc.nextInt();
	        c = sc.nextInt();
	        
	      
	           
	                  if (c % 2 ==0 )
	                 {
	                   for (int j = 0 ; j < c-1 ;j++)
	                     {
	                a =a*2;
	                b=b*2;
	                     }
	                 }
	        else 
	           { 
	               for (int j = 0 ; j < c-2 ;j++)
	               {    
	                   a =a *2;
	                    b=b*2;
	               }
	                   a = a *2;
	           }
	            
	            //System.out.println(a+"  "+b);
	            if(a > b)
	            a =a/b;
	            
	            else
	            a =b/a;
	    
	        System.out.println(a);
	    
	    } 
	    
	}
}
