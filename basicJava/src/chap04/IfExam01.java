package chap04;

import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
		//int num= -2;
		int num= 0;
		//int num= 5;
		//int num= 6;
		
		Scanner key = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		num = key.nextInt();
		
		if(num<0) {
			System.out.println(num+"은 음수입니다.");
		}
		else if(num==0) {
			System.out.println(num+"은 0입니다.");
		}
		else if(num % 2 == 0) {
			System.out.println(num+"은 양수이며 짝수입니다.");
		}
		else {
			System.out.println(num+"은 양수이며 홀수입니다.");
		}
		key.close();

	}

}
