package b4DruCare.oops.polymorphism.override;

public class Child extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.wealth();
		child.toCode();
		child.toMarry();
	}
	public void toCode() {
		System.out.println("coding");
	}
	
	public void toMarry() {
		System.out.println(" marry b ");
	}
	
}
