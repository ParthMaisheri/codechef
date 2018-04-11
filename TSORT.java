import java.util.*;
import java.lang.*;
 
class TSORT 
{
    public static void main(String[] args) throws java.lang.Exception
    {
        int v;
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();
        int a[] = new int[v];
        for(int i = 0; i < v ; i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
         for(int i = 0; i < v ; i++)
        {
        System.out.println(a[i]);
        }
    }
}
