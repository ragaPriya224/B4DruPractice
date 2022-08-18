package b4DruCare.oops.classAndObjectDemo;

public class Student {
	int id;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.printName("ayisha");
		s1.id = 40;
		System.out.println(s1.id);

		Student vishal = new Student();
		vishal.printName("vishal");

		Student sameera = new Student();
		sameera.printName("sameera");

		Student ajay = new Student();
		ajay.printName("ajay");
	}

	public  void printName(String name) {
		System.out.println("hello " +name);
	}

}
