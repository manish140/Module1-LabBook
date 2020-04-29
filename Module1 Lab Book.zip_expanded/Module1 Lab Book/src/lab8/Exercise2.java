package assignments8;
import java.util.*;
// Using thread class
 class task implements Runnable
 {
	 public void run()
	 {
		 while(true)
		 {
			 System.out.println(new Date());
			 try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
	 }
 }
 public class Exercise2
 {
	 public static void main(String args[])
	 {
		 task t1=new task();
		 Thread t=new Thread(t1);
		 t.start();
	 }
 }

