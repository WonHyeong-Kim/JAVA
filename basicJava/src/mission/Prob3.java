package mission;

import java.util.Scanner;

public class Prob3 {
	public static void main(String[] args) {
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요.:");
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		if(num<2 | num > 9) {
			System.out.println("잘못된 숫자가 입력되었습니다.");
			key.close();
			return;
		}
		int result=1;
		for(int i=1; i<=num;i++) {
			result=1;
			for(int j=1; j<=i;j++) {
				result*=j;
			}
			System.out.println(i + " ! = " + result);
		
		}
		
		key.close();
	}
}
