import java.util.Scanner;
import java.util.*;
class m{
    public static void main (String[] args) 
    {
        Scanner c=new Scanner(System.in);
       
      int n,i,max,min,cc=0,ni,m;
     
        n=c.nextInt();
        
     int a[] =new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=c.nextInt();
        }
        int l=a.length;
        Arrays.sort(a);
 System.out.println("Second max no:"+a[l-1]);
  
     
    }
}
