import java.io.*;
import java.util.*;
class symmetric
{
  public static void main(String arg[])
  {
   int m,n,i,j,flag=0;
   int a[][] = new int[10][10];
   int temp[][] = new int[10][10];
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the no.of rows :");
   m=sc.nextInt();
  System.out.println("Enter the no.of columns:");
  n=sc.nextInt();
  System.out.println("Enter the elements:");
  for(i=0;i<m;i++)
   {
    for(j=0;j<n;j++)
    {
      a[i][j]=sc.nextInt();
     }
    }
   System.out.println("Matrix1:");
  for(i=0;i<m;i++)
   {
    for(j=0;j<n;j++)
    {
      System.out.print(a[i][j]+" ");
     }
    System.out.println();
    }
 
  for(i=0;i<m;i++)
   {
    for(j=0;j<n;j++)
    {
      temp[j][i]=a[i][j];
     }
    }
    System.out.println("After interchanging:");
    for(i=0;i<m;i++)
   {
    for(j=0;j<n;j++)
    {
     System.out.print(temp[i][j]+" ");
     }
     System.out.println();
    }

    for( i=0;i<m;i++)
   {
    for(j=0;j<n;j++)
    {
      if(temp[i][j]!=a[i][j])
        flag=1;
        break;
         
     }
    }
    if(flag==1)
      System.out.println("It is a not symmetric matrix");
    else
        System.out.println("It is  a symmetric matrix");
    
  }
}