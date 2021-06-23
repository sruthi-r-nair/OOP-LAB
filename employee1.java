import java.io.*;
import java.util.*;
 class Employee
{
 String empid,name,address;
int salary;
 Employee()
 {
 empid=" ";
 name=" ";
 salary=0;
 address=" ";
 }
 void read()
 {
 Scanner sc= new Scanner(System.in);
 System.out.println(" Enter id");
 empid=sc.nextLine();
 System.out.println(" Enter name");
 name=sc.nextLine();
 System.out.println(" Enter salary");
 salary=sc.nextInt();
 sc.nextLine();
 System.out.println(" Enter address");
 address=sc.nextLine();
 }
 void display()
 {
 System.out.println("Id : "+empid);
 System.out.println("Name :"+name);
 System.out.println("Salary :"+salary);
 System.out.println("Address :"+address);
 }
}


 class Teacher extends Employee
{
 String dept;
 String subject;
 Teacher()
 {
 dept="";
 subject="";
 }
 void read()
 {
 super.read();
 Scanner sc= new Scanner(System.in);
 System.out.println(" Enter dept name");
 dept=sc.nextLine();
 System.out.println(" Enter subject name");
 subject=sc.nextLine();
 }
 void display()
 {
 super.display();
 System.out.println("Department :"+dept);
 System.out.println("Subject taught :"+subject);
 }
}

class employee1
 {
 public static void main(String args[])
 {
 Scanner sc= new Scanner(System.in);
  System.out.println("No.of teacher's details to enter:");
  int n=sc.nextInt();
 Teacher t[]=new Teacher[n];
 for (int i=0; i<n; i++)
 {
 t[i]=new Teacher();
 t[i].read();
 }
 for (int i=0; i<n; i++)
 {
System.out.println("\t");
 System.out.println("Employee details:");
 t[i].display();
System.out.println("\t");
 }
}
}