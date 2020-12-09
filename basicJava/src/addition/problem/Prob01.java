package addition.problem;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요 : ");
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		if(num>1 & num<10) {
			for(int i=0; i<9; i++) {
				System.out.println(num + " * " +(i+1) + " = "+(i+1)*num);
			}
		}else {
			System.out.println("잘못된 숫자가 입력되었습니다.");
		}
		key.close();
	}
}
