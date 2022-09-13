package b4DruCare.multithreading.ByExtending;

public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreadingDemo demo = new MultiThreadingDemo();
		System.out.println(" inside main method, Thread name is : "+Thread.currentThread().getName());
		demo.start();
//		demo.run();
		
	}

}

//1. always call start, don't call run method 
//2. u can override start method, but that's of no use
