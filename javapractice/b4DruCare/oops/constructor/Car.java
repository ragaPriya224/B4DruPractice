package b4DruCare.oops.constructor;

public class Car {

	int tyres;
	String colour;
	Car(){
		this.colour  = "black";
	}
	Car(String colour){
		this.colour  = colour;
	}
	public static void main(String[] args) {
		
		Car vehicle = new Car();
		System.out.println(vehicle.colour);
		System.out.println(vehicle.tyres);
		vehicle.stop();
		Car bmw = new Car("white");
		System.out.println(bmw.colour);
		System.out.println(bmw.tyres);
	
	}
	
	public void stop() {
		System.out.println(" vehicle should stop");
	}

}
