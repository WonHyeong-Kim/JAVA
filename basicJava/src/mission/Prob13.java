package mission;

import java.util.Scanner;

public class Prob13 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("초기값을 정수로 입력하세요.:");
		int startNumber=key.nextInt();
		
		System.out.print("마지막 값을 정수로 입력하세요:");
		int endNumber=key.nextInt();
		
		System.out.print("중가분을 정수로 입력하세요");
		int addNumber=key.nextInt();		
		
		int sum=0;
		int num=startNumber;
		
		while(num<endNumber+addNumber) {
			sum+=num;
			num+=addNumber;
			
		}
		
		if(sum>1000) {
			sum+=2000;
		}
		System.out.print("총합은 "+sum+" 입니다.");
		
		key.close();
	}

}
