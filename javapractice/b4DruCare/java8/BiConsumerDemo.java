package b4DruCare.java8;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> bc1 = (x,y) -> System.out.println(x+y);
		bc1.accept(10,20);
		
		BiConsumer<Integer, Integer> bc2 = (x,y) -> System.out.println(x-y);
		bc2.accept(10,20);
	}

}
