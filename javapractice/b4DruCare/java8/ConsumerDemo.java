package b4DruCare.java8;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> c1 = (s)-> System.out.println(s.toUpperCase());
		
		//left side functional Interface , right side lambda expression
//		only FI can receive a lambda expression
//		c1.accept("hello");
		
		Consumer<String> c2 = (s) -> System.out.println(s.length());
//		c2.accept("tokyo");
		c1.andThen(c2).accept("hello world" ); // used default 
		
		Consumer<Integer> c3 = (s) ->System.out.println(s+10);
//		c1.andThen(c3).accept("hello world" );  // nt valid 
		Consumer<Integer> c4 = (s) ->System.out.println(s-10);
		c3.andThen(c4).accept(100);

	}

}
