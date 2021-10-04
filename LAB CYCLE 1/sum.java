import java.io.*;
import java.util.*;
class sum
{
public static void main(String args[])
 {
   int i=1,n,sum=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the limit:");
   n=sc.nextInt();
 System.out.println("Enter the numbers:");
   while(i<=n)
    {
     sum=sum+i;
     i++;
    }
   System.out.println("sum of  numbers :"+sum);
  }
}