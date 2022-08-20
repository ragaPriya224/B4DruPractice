package b4DruCare;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 0;
//		while(i<5) {
//			System.out.println("hello");
//			if(i == 2) {
//				continue;
//			}
//			System.out.println("bye");
//			i++;
//		}
		
		for(int i = 1; i< 5;i++) {
			if(i == 2) {
				continue;
			}
			System.out.println("hello" +i);
		}
	}

}
