package b4DruCare.java8;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
	Predicate<Integer> lessThan  = a -> a<50;
	
	System.out.println(lessThan.test(100));
	Predicate<Integer> gt  = a -> a>50;
	Predicate<Integer> eq  = a -> a==50;
	
	System.out.println("And  "+ gt.and(lessThan).test(20));
	System.out.println("OR  "+ gt.or(lessThan).test(20));
	}

}
