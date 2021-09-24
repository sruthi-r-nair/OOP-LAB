import Arithmetic.*;
import java.util.*;
class Arithmetic
 {
  public static void main(String agrs[])
  {
   int a,b;
   System.out.print("Enter the 2 numbers:");
   Scanner sc=new Scanner(System.in);
   a=sc.nextInt();
   b=sc.nextInt();
   Action A=new Action();
   A.add(a,b);
   A.sub(a,b);
   A.mul(a,b);
   A.div(a,b);
 }
}


Package Arithmetic;
 interface operations
 { 
    void add(int a,int b);
    void sub(int a,int b);
    void mul(int a,int b);
    void div(int a,int b);
  }

public class Action implements operations
 {  
     public void add(int a, int b)
   {
    System.out.println("The sum of 2 number are:"+(a+b));
   }
    public void sub(int a, int b)
   {
    System.out.println("The differentce of 2 number are:"+(a-b));
   }
    public void mul(int a, int b)
   {
    System.out.println("The product  of 2 number are:"+(a*b));
   }
   public void div(int a, int b)
   {
    System.out.println("The division  of 2 number are:"+(a/b));
   }
}

