import java.io.*;
import java.util.*;
public class oddeven

 {
   public static void main(String args[])
    { 
      int a[]=new int[100],i,n=5,c;
     try
      {
       FileWriter f1=new FileWriter("F:\\MCA\\2ND SEM\\OOP LAB\\LAB2\\odd.txt");
       FileWriter f2=new FileWriter("F:\\MCA\\2ND SEM\\OOP LAB\\LAB2\\even.txt");
        FileWriter oe = new FileWriter("F:\\MCA\\2ND SEM\\OOP LAB\\LAB2\\oddeven.txt");
       Scanner sc=new Scanner(System.in);
       System.out.println(" Enter the numbers //the value of n is already given//:");
       for (i=0; i<n; i++)
        {
          a[i]=sc.nextInt();
         oe.write(a[i]+"\n");
        }
        oe.close();
        System.out.println("Success!!!!!!!");
        String s;
        FileReader fr=new FileReader("F:\\MCA\\2ND SEM\\OOP LAB\\LAB2\\oddeven.txt"); 
        BufferedReader br=new BufferedReader(fr);
       while((s=br.readLine())!=null)
        {
          c=Integer.parseInt(s);
          if(c % 2 == 0)
             f2.write(c+"\n");
          else
            f1.write(c+"\n");
            
         }
         f1.close();
         f2.close();
         fr.close();
    
      }
     catch (IOException e)
      { 
        System.out.println("An error occurred."); 
      }
   }
}