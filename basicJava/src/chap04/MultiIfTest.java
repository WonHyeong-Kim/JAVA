package chap04;

public class MultiIfTest {

	public static void main(String[] args) {
		int ssn=1;
		if(ssn == 1 | ssn ==3) {
			System.out.println("남자");
		}
		else if(ssn == 2 | ssn ==4) {
			System.out.println("남자");
		}else {
			System.out.println("기타");
		}


	}

}
