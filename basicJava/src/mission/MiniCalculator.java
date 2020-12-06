package mission;

import java.util.Scanner;

public class MiniCalculator {
	public static void main(String[] args) {
		System.out.print("*******미니계산기*******\n"
				+ "1. 더하기\n"
				+ "2. 곱하기\n"
				+ "3. 빼기\n"
				+ "4. 나누기\n"
				+ "연산자를 선택하세요."
				);
		Scanner key = new Scanner(System.in);
		int opr = key.nextInt();
		System.out.print("숫자를 입력하세요 ");
		double num1 = key.nextDouble();
		double num2 = key.nextDouble();
		boolean oprError=false;
		double result = 0;
		switch (opr) {
		case 1:
			result = num1+num2;
			break;
		case 2:
			result = num1*num2;
			break;
		case 3:
			result = num1-num2;
			break;
		case 4:
			result = num1/num2;
			break;
		default:
			oprError=true;
			break;
		}
		if(oprError == false) {
			System.out.println("계산결과=>"+result);
		}
		
		key.close();
	}

}
