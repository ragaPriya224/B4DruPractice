package b4DruCare.multithreading;

public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread multiThread = new Thread(new MultiThreadingDemo());
	

		System.out.println("inside main method   Thread name is : " + Thread.currentThread().getName());
		Thread.currentThread().setPriority(3);
		System.out.println("inside main method   Thread name is : " + Thread.currentThread().getPriority());

		multiThread.start();
		
		
		
	}

}

//1. always call start, don't call run method 
//2. u can override start method, but that's of no use

// priority to be in range 1- 10 
//5 - > normal

//get priority, set priority 
// getname, setname 

