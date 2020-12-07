package chap04;

public class WhileTest {
	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		i=1;
		while(true) {
			
			System.out.println(i);
			if(i>=10) {
				break;
			}
			i++;
		}
	}
}
