import java.io.*;
import java.util.*;
class SalesMan
{ 
  String name;
  String code;
  int amount;
  double commission;
  void readData()
  { 
    Scanner dp=new Scanner(System.in);
    System.out.println("Name:");
    name=dp.nextLine();
    System.out.println("Code:");
    code=dp.nextLine();
    System.out.println("Amount:");
    amount=dp.nextInt();
  }
  void calculateCommission()
  {
    if (amount < 2000)
     commission=0.08* amount;
    else if (amount<=5000)
      commission=0.10 * amount;
    else if(amount> 5000)
      commission=0.12* amount;
  }
 void display()
 {
 System.out.println("\n");
   System.out.println("Name of the salesman:"+ name);
   System.out.println("Sales Amount:"+amount);
   System.out.println("Commission:"+commission);
 }
}
class SalesMan1
{
 public static void main(String args[])
 {
  SalesMan s1=new SalesMan();
  s1.readData();
  s1.calculateCommission();
  s1.display();
 }
}