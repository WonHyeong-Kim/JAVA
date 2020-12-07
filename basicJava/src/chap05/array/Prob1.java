﻿package chap05.array;


import java.util.Scanner;
public class Prob1 {

	public static void main(String args[]) {

		int inputInt = 0;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");
		inputInt = keyboard.nextInt();
		
		if(inputInt<2 | inputInt>9) {
			System.out.println("잘못된 숫자가 입력되었습니다.");
			return;
		}
		
		for(int i=1; i<=9;i++) {
			System.out.println(inputInt+" * "+i+" = "+(inputInt*i));
		}
	}
}
