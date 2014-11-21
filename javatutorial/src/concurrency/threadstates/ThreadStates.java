package concurrency.threadstates;


class MyThread extends Thread{
	   boolean waiting= true;
	   boolean ready= false;
	   MyThread() {
	   }
	   /*public void run() {
	      String thrdName = Thread.currentThread().getName();
	      System.out.println(thrdName + " starting.");
	      while(waiting)
	      System.out.println("waiting:"+waiting);
	      System.out.println("waiting...");
	      startWait();
	      try {
	         Thread.sleep(1000);
	      }
	      catch(Exception exc) {
	         System.out.println(thrdName + " interrupted.");
	      }
	      System.out.println(thrdName + " terminating.");
	   }*/
	   synchronized void startWait() {
	      try {
	         while(!ready) wait();
	      }
	      catch(InterruptedException exc) {
	         System.out.println("wait() interrupted");
	      }
	   }
	 
	}

public class ThreadStates {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		      MyThread thrd = new MyThread();
		      showThreadStatus(thrd);
		      thrd.start();
		      showThreadStatus(thrd);
		      showThreadStatus(thrd);
		      thrd.sleep(5000);
		      showThreadStatus(thrd);
		      
		      thrd.interrupt();
		      showThreadStatus(thrd);
	}
	
	static void showThreadStatus(Thread thrd) {
	      System.out.println(thrd.getName()+":"+ thrd.getState() );
	   }

}
