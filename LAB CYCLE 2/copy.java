import java.io.*;
class Copy
{
 public static void main(String args[])throws IOException, FileNotFoundException
  {
    int i;
     File f1=new File("F:\\MCA\\2ND SEM\\OOP LAB\\f1.txt");
     File f2=new File("F:\\MCA\\2ND SEM\\OOP LAB\\f2.txt");
     FileInputStream fin=new FileInputStream(f1);
     FileOutputStream fout=new FileOutputStream(f2);
     do
     {
      i=fin.read();
      if (i !=-1)
        fout.write(i);
     }while(i!=-1);
   System.out.println("copy my file to another file");
    fin.close();
     fout.close();
 }
}