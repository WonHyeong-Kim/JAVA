package chap05.obj;

import java.util.Scanner;

public class MiniCalculator {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("*******미니계산기*******\n"
				+ "1. 더하기\n"
				+ "2. 곱하기\n"
				+ "3. 빼기\n"
				+ "4. 나누기\n"
				+ "연산자를 선택하세요.:"
				);
		
		int opr = key.nextInt();
		if(opr<1 | opr>4) {
			 System.out.println("잘못 입력하셨습니다.");
		}
		else {
			
			System.out.print("숫자를 입력하세요 ");
			double num1 = key.nextDouble();
			double num2 = key.nextDouble();
			MyMethodUtil mymethod = new MyMethodUtil();
			double result = mymethod.calc(num1, num2, opr);
			System.out.println(result);
		}
		key.close();
	}

}
