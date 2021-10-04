import java.io.*;
import java.util.*;
 class NegException  extends Exception  
{  
    public void show()  
    {  
      
      
       System.out.println("Only positive numbers are allowed.!!!"); 
          
    }  
}

class Average
{
 public static void main(String args[])
  {
    int i,sum=0,a,n;
    float avg=0;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the limit");
  n=sc.nextInt();
  try
   {
     for(i=1;i<=n;i++)
      {
         System.out.print("Enter  number " + (i ) + ": ");
         a = sc.nextInt();
        if(a < 0 )
          throw new NegException();
        sum=sum+a;
       }
     avg=sum/n;
    System.out.println("The average of "+ n +" numbers :"+avg);
    }
   catch(NegException e)
      {
        e.show();  
      }

   }
}
 