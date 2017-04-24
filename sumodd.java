import java.util.Scanner;
import java.util.*;
class m{
    public static void main (String[] args) 
    {
        Scanner c=new Scanner(System.in);
       
      int s=0,e,i;
        e=c.nextInt();
        for(i=1;i<=e;i++)
        {
            if(i%2!=0)
            s+=i;
        }
     System.out.println("sum of odd no:"+s);
     
    }
}
