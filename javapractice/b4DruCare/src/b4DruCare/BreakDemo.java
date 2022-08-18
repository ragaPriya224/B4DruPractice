package b4DruCare;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int count = 0;
//		while(count < 5) {
//			System.out.println("hello");
//			if(count == 2) {
//				continue;
//			}
//			System.out.println("bye");
//			count++;
//		}
		
		for(int count = 1; count< 5;count++) {
			if(count == 2) {
				continue;
			}
			System.out.println("hello" +count);
		}
	}

}
