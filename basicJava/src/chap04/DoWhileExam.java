package chap04;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num =0;
		do {
			System.out.print("숫자를 입력하세요:");
			num = key.nextInt();
		}
		while(num>=10);
		System.out.print("입력 성공");

		key.close();
	}

}
