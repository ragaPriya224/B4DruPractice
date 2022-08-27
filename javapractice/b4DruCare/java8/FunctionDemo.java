package b4DruCare.java8;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<String,Integer> func = x -> x.length();
		System.out.println(func.apply("team"));
	}

}
