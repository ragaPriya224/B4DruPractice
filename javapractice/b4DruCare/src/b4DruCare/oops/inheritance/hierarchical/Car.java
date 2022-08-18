package b4DruCare.oops.inheritance.hierarchical;

public class Car {
	
	String engineType;
	int modelNumber;
	String colour;

	public static void main(String[] args) {
		Car benz = new Car();
		benz.printName("bmw" );

	}
	public void printName(String name) {
		System.out.println("name is : " + name);
	}
	
	public static void printTyres(int number) {
		System.out.println("no. of tyres  : " + number);
	}
}
