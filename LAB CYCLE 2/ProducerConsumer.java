class Interthread
{
  int number=0;
  boolean value = false;
  synchronized int get()
  {
    if (value==false)
       try
        {
          wait();
        }
       catch (InterruptedException e)
        {  
          System.out.println("Exception!!!!!");
        }
   System.out.println("consume: " + number);
   value=false;
   notify();
   return number;
  }
 synchronized void put(int number)
  {
    if (value==true)
      try {
         wait();
        }
     catch (InterruptedException e)
      { 
        System.out.println("Exception");
      }
  this.number=number;
  System.out.println("Produce: " + number);
  value=true;
  notify();
}
}
class ProducerX extends Thread
{
  Interthread itc;
  ProducerX(Interthread itc)
   {
     this.itc=itc;
     this.start();
    }
  public void run()
  {
   int i=0;
   while(true)
    {
     itc.put(++i);
     
     
     } 
   }
}

class ConsumerX extends Thread
 {
   Interthread itc;
  ConsumerX(  Interthread itc)
  {
   this.itc=itc;
   this.start();
  }
   public void run()
  {
    while(true)
     {
       itc.get();
     }
   }
}

class ProducerConsumer
 {
   public static void main(String args[])
    {
        Interthread itc=new  Interthread();
       ProducerX P=new ProducerX(itc);
       ConsumerX C=new ConsumerX(itc);
     }
  }