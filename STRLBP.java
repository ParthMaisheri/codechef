/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
			 int a,c=0;
      Scanner sc = new Scanner(System.in);
      a = sc.nextInt();
      int count =0;
      for (int j = 0 ;j < a ; j++ )
      {
            String s=sc.next();
            
            for (int i = 0;i < 8;i++)
            {
                if(i < 7)
                {
                if(s.charAt(i)== '0' && s.charAt(i+1)== '1')
                {
                    //System.out.println(s.charAt(i));
                    count++;
                }
                else if (s.charAt(i)== '1' && s.charAt(i+1)== '0')
                {
                    count++;
                }
                else
                {
                    int d =0;
                }
                }
            }
            if(count <= 2)
            {
                System.out.println("uniform");
               
            }
            else
                System.out.println("non-uniform");
            
            count =0 ;
      } 
      
	}
}
