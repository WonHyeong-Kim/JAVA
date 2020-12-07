package chap04;

public class DoWhileTest {

	public static void main(String[] args) {
		int i = 9;
		while (i >= 10) {
			i++;
			System.out.println(i);
		}
		i = 9;
		do {
			i++;
			System.out.println(i);
			
		} while (i >= 10);
	}

}
