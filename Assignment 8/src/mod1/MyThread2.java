package mod1;

class MyThread2 extends Thread
{
   public void run ()
   {
      System.out.println ("Run by " + Thread.currentThread().getName());
      try
      {
         Thread.sleep (100);
      }
      catch (InterruptedException e)
      {
      }
   }
}
