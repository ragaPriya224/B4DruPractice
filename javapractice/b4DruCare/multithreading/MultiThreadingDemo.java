package b4DruCare.multithreading;

public class MultiThreadingDemo implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method ");
		 Thread.currentThread().setName("child  thread");
		System.out.println("inside run method   Thread name is : " + Thread.currentThread().getName());

	}

	
}
