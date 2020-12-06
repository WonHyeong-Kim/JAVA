package mission;

import java.util.Scanner;

public class Prob6 {

	public static void main(String[] args) {
		System.out.print("입력하세요:");
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		System.out.println(num+"의 배수");
		int count=0;
		int sum = 0;
		for(int i=num; i<1001;i++) {
			if(i%num ==0) {
				count++;
				sum+=i;
			}
		}
		System.out.println("개수 = "+count);
		System.out.println("7의 배수 합 = "+sum);
		key.close();
	}

}
