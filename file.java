import java.util.*;
import java.io.*;
import java.util.*;
class file
{
  public static void main(String args[])
   {
    File f1=new File("F:\\MCA\\2ND SEM\\OOP LAB\\LAB2");
    if (f1.isDirectory())
     {
       System.out.println("Details :"+f1.getAbsolutePath());
         System.out.println("..........................\n");
       String s[]=f1.list();
       System.out.println("Total No.of files :"+s.length);
       System.out.println("..........................\n");
       for(int i=0;i<s.length;i++)
        {
           File f2=new File("F:\\MCA\\2ND SEM\\OOP LAB\\LAB2"+"\\"+s[i]);
           if (f2.isDirectory())
               System.out.println(s[i]+"is a directory \n"); 
           else
             System.out.println(s[i]+"  is a file\n"); 
         }
       }
     else
       System.out.println("F:\\MCA\\2ND SEM\\OOP LAB\\LAB2"+" is not a directory");
     System.out.println(" Enter a file name :");
     Scanner sc=new Scanner(System.in);
     String fname=sc.nextLine();
     String filelist[]=f1.list();
     boolean found=false;
     for(int i=0;i<filelist.length;i++)
      {
        File f2=new File("F:\\MCA\\2ND SEM\\OOP LAB\\LAB2"+"//"+filelist[i]);
        if (fname.equals(f2.getName()))
        {
          System.out.println(fname+"Already exists!!!!!");
          found=true;
          break;
         }       
       }
     if (!found)
       System.out.println(" New File "); 
}
}