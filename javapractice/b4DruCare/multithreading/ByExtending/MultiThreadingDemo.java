package b4DruCare.multithreading.ByExtending;

public class MultiThreadingDemo extends Thread {

	public void run() {
		System.out.println(" multithreading run is called ");
		System.out.println("inside run method   Thread name is : " + currentThread().getName());
	}
	// this is of no use 
	public void start() {
		System.out.println(" start method is called ");
		System.out.println("inside start method   Thread name is : " + currentThread().getName());
	}

}
