package b4DruCare;

public class EligiblityCondition {

	public static void main(String[] args) {
		int age = 50;
		String nationality = "chinese";
		
		if(age>=18 || nationality == "indian") {
			System.out.println("you can vote");
		}else {
			System.out.println("u cannot vote");
		}

	}

}
