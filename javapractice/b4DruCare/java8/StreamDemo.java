package b4DruCare.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import b4DruCare.java8.data.Person;

public class StreamDemo {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("aisha");
		nameList.add("sameera");
		nameList.add("ajay");
		nameList.add("vishal");
		nameList.add("ajay");
		nameList.add("aaron");
		
		

//		List<String> outputList = nameList.stream().filter(a -> a.startsWith("a")).map(a ->a.toUpperCase()).sorted().distinct().collect(Collectors.toList());
//		System.out.println(outputList);
		
		Person p1 = new Person("aisha", 110, 9500, "Male", 2, Arrays.asList("Cricket", "Swimming", "Tennis"));
		Person p2 = new Person("ajay", 165, 1548, "Male", 1, Arrays.asList("Swimming", "Tennis"));
		Person p3 = new Person("sameera", 165, 1548, "Male", 1, Arrays.asList("book", "Tennis"));
		Person p6 = new Person("ajay", 155, 2008, "Male", 1, Arrays.asList("basket", "Tennis"));
		Person p7 = new Person("vishal", 165, 1548, "Male", 1, Arrays.asList("foot", "Tennis"));

		 List<Person> personList = Arrays.asList( p1,p2,p3,p6, p7);
		 
			Optional<Person> data = personList.stream().filter(a -> a.getName().equals("ajay")).findFirst();
			System.out.println(data);

	}

}
