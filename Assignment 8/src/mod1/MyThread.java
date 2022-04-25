package mod1;

import javax.swing.*;

public class MyThread extends Thread{
	
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
	      System.out.println("Thread State of: "+ Thread.currentThread().getName()+ " - "+Thread.currentThread().getState()); 
	 
	      System.out.println("Exit of Thread: " + Thread.currentThread().getName());  
	   }
}
