package b4DruCare.oops.polymorphism;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		d.m1("user");
	}
	public void m1() {
		System.out.println("m1 method is called");
	}
	public void m1(int num) { //method overloaded
		System.out.println("m1 overloaded");
		System.out.println(5+num);
	}
	public void m1(String name) { //method overloaded

		System.out.println("hi" +name);
	}
}
