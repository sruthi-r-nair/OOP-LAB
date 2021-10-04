import java.io.*;
import java.util.*;
class Multable extends Thread
{
  Multable()
   {
     start();
   }
 public void run()
  { 
    try
    {
     System.out.println("Multiplication table of 5:");
     System.out.println(".................................");
     for (int i=1;i<=10;i++)
      { 
       System.out.println(i+" * 5 ="+i*5);
       Thread.sleep(5000);
      }
     
     }
     catch(Exception e)
      {
       System.out.println(e.toString());
      }
  }
}
class Prime extends Thread
{
  Prime()
  {
   start();
  }
  public void run()
  {
   try
    {
     int count=0,i,flag=0,num,n;
     System.out.println("Enter the limit:");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     System.out.println("First "+n+" prime numbers  :-");
     for(num=2;count<n;num++)
     {
       flag=1;
      for(i=2;i<=num/2;i++)
       {
        if(num%i==0)
         {
          flag=0;
          break;
         }
       }
      if(flag==1)
       {
         System.out.println(num);
         count++;
       }
     } 
    }
   catch(Exception e)
      {
       System.out.println(e.toString());
      }
  }
}
class Threads
{
 public static void main(String args[])
  {
   new Multable();
   new Prime();

  }
}