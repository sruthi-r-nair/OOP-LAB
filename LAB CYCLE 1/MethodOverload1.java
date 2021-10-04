class MethodOverload
{
    void calculate(int n,char ch)
     {
       if(ch=='s')
        {
          int a=n*n;
          System.out.println("Square of "+n +" is "+ a);
        }
        else
         {
           int a=n*n*n;
            System.out.println("Cube of "+n +" is "+ a);
         }
       }
     void calculate(int n,int m,char ch)
     { 
     if(ch=='p')
        {
          System.out.println("Product of "+n+" and "+m+" is "+(n*m));
        }
     else
      System.out.println("Sum of "+n+" and "+m+" is "+(n+m));
    }
   void calculate(String str1, String str2)
  {
   if(str1.equals(str2))
      System.out.println( "The  strings "+str1+" and "+str2+" are equal");
   else
 System.out.println("The  strings "+str1+" and "+str2+" are not equal");
   }
 }
class MethodOverload1
{
 public static void main(String args[])
  {
    MethodOverload ov=new MethodOverload();
    ov.calculate(10,'s');
    ov.calculate(10,5,'s');
    ov.calculate("Achan","Amma");
   }
}