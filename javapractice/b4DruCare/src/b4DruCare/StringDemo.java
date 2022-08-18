package b4DruCare;

public class StringDemo {

	public static void main(String[] args) {
		String name = new String("icecream");
		System.out.println(name);
		String value = "ajay:vishal:sameera:sowmya";
		System.out.println(value);
		System.out.println(value.length());
		System.out.println(value.toUpperCase());
		System.out.println(value.toLowerCase());
		System.out.println(value.charAt(2));  // trying to get the character
		System.out.println(value.concat("earth"));
		System.out.println(value.startsWith("S"));
		System.out.println(value.endsWith("dy"));
		System.out.println(value.replace('e', 'z'));
		System.out.println(value.substring(5));
		System.out.println(value.substring(5, 9));
		System.out.println(value.indexOf('l')); // trying to get the index 
		System.out.println(value.lastIndexOf('l'));
		String[] result = value.split(":");
		for(String alpha: result) {
			System.out.println(alpha);
		}
		System.out.println(value.split(":"));
		
	}

}
