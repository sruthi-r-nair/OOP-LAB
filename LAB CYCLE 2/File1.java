import java.io.*;
import java.util.*;
public File1
  {
    public static void main(String args[])throws IOException,FileNotFoundException
    {
      int i;
      File f1=new File("F:\\MCA\\2ND SEM\\OOP LAB\\LAB2\\file\\writefile.txt");
      FileInputStream fin=new FileInputStream(f1);
      FileWriter myWriter = new FileWriter("F:\\MCA\\2ND SEM\\OOP LAB\\LAB2\\file\\writefile.txt");
           //myWriter.write("my name is sruthi");
      Scanner sc=new Scanner(System.in);
      System.out.println("Write a content to the files:");
      String a[]=new String[3];
      for ( i=0; i<3; i++)
      {
       a[i]=sc.nextLine();
       myWriter.write(a[i]+"\n");
      }
    myWriter.close();
    System.out.println(" Display contents in the file:");
      do
      {
       
       i=fin.read();
       if (i !=-1)
       {
       System.out.print((char)i);
       }
while(i!=-1);
     fin.close();
   }
}
}