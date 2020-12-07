package chap04;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("단을 입력하세요 :");
		int col = key.nextInt();
			for(int i=1; i<10;i++) {
			System.out.println(col + " * " + i + " = "+ (i*col));
		}
		key.close();
	}

}
