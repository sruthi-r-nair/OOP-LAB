import java.io.*;
import java.util.Scanner;
class product
{
 int pcode,price;
 String pname;
 void insert(int code,String name,int price)
 {
   this.pcode=code;
   this.pname=name;
   this.price=price;
 }
 void display()
 {
  
  System.out.println("Code : "+this.pcode);
  System.out.println("Name : "+this.pname);
  System.out.println("Price: "+this.price);
  System.out.println("\n");
 }
}
class Product1
{
 public static void main(String args[])
 {
   product p1=new product();
   product p2=new product();
   product p3=new product();
   p1.insert(100,"soap",25);
   p2.insert(101,"pencil",10);
   p3.insert(102,"biscuit",40);
   p1.display();
   p2.display();
   p3.display();
   
  System.out.println("The product having the lowest price:");
    if((p1.price<p2.price)&&(p1.price<p3.price))
     {
      System.out.println(p1.price);
      }
    else if((p2.price<p1.price)&&(p2.price<p3.price))
     {
         System.out.println(p2.price);
     }
   else
{
    System.out.println(p3.price);

 }
}
}
   