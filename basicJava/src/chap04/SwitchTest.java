package chap04;

public class SwitchTest {

	public static void main(String[] args) {
		/*double doubleVal = 10.5;
		switch(doubleVal) {
		case 10.0:
			System.out.println("A");
		}*/
		
		int data=5;
		switch(data+60) {
		case 'A':
			System.out.println("A");
			break;
		case 'B':
			System.out.println("B");
			break;
		}
		
		String code = new String("A01");
		switch(code) {
		case "A01":
			System.out.println("A01");
			break;
		case "A02":
			System.out.println("A02");
			break;
		}
		

	}
}
