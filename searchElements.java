import java.io.*;
import java.util.*;
class SearchElements
{
 public static void main(String args[])
 {
   int i,n,s,flag=0;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the no.of elements in an array:");
  n = sc.nextInt();
  int a[]=new int[n];
  System.out.println("Enter the array elements");
  for(i=0;i<n;i++)
   {
     a[i]=sc.nextInt();
   }
  System.out.println("Enter the element to be search:");
  s=sc.nextInt();
  for(i=0;i<n;i++)
  {
   if(a[i]== s)
     {
       flag=1;
       break;
     }
  } 
  if(flag==1)
   System.out.println("The element found in the position:"+(i+1));
  else
    System.out.println("The element is not found ");
 }
}