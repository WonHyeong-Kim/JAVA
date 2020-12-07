package chap04;

public class AlphaTest {

	public static void main(String[] args) {
		int len = 'Z'-'A';
		char alpha =' ';
		for(int i=0;i<len+1;i++) {
			alpha = (char) ('A'+i);
			System.out.print(alpha);
		}
		System.out.println();
		for(char i='A'; i<='Z';i++) {
			System.out.print(i);
		}

	}

}
