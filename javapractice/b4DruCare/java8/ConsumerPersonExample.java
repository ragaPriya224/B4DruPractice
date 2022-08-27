package b4DruCare.java8;

import java.util.List;
import java.util.function.Consumer;

import b4DruCare.java8.data.Person;
import b4DruCare.java8.data.PersonRepository;

public class ConsumerPersonExample {

	static Consumer<Person> c1 = (per)-> System.out.println(per);
	static Consumer<Person> c2 = (per)-> System.out.println(per.getName().toUpperCase());
	static List<Person> personList = PersonRepository.getAllPersons();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
	
		personList.forEach(c1);
		printWithCondition();
		
	}
	/**
	 * boys basket ball team with condition height greateror equal to 140 and gender must be male
	 */
	public static void printWithCondition() {
		personList.forEach(per ->{
			
			if(per.getGender() == "Male" && per.getHeight()>= 140) {
//				c1.andThen(c2).accept(per);
			}
		});
		
		
	}

}
