package b4DruCare.oops.inheritance;

public class Lamb extends Goat { //single inheritance


	//Goat -> parent class
	//lamb -> child classss

	public static void main(String[] args) {

		Lamb child = new Lamb();
		System.out.println(child.colour);
		child.walk();
		child.sound();
	}

	public void walk() {
		System.out.println("lamb is walking ");
	}

}
