package chap05.obj;

import java.util.Scanner;

public class IfExam02 {

	public static void main(String[] args) {	
		Scanner key = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = key.nextInt();
		System.out.print("성별을 입력하세요(1-남자, 2-여자) : ");
		int gender = key.nextInt();
		
		MyMethodUtil m = new MyMethodUtil();
		m.checkVal(age, gender);
		
		key.close();
	}

}
