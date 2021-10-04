import java.io.*;
import java.util.Scanner;
 class UsernameException  extends Exception  
{  
    public void show()  
    {  
      
      System.out.println("Invalid Username" );
       System.out.println("Username contain only characters "); 
          
    }  
}
 
class PasswordException extends Exception  
{  
    public void show()  
    {   
      System.out.println("Invalid Password " );
      System.out.println("Password contain only 6 characters");
          
    }  
}
 
class login
{
 public static void main(String args[])
  {
  String u,p;
  Scanner sc= new Scanner(System.in);
 System.out.println("Enter your username:");
 u=sc.nextLine();
 System.out.println("Enter your Password:");
 p=sc.nextLine();
  int length = u.length();
 try
  {
    if(length<6)
      throw new UsernameException();
    else if(!p.equals(" qwerty"))
      throw new PasswordException();
    else
     System.out.println("Logged In Succesfully" );
   }
 catch(UsernameException e)
      {
        e.show();  
      }
catch(PasswordException e)
      {
        e.show();  
      }
}  
}