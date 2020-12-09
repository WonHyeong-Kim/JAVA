package addition.problem;

import java.util.Scanner;

public class Prob14 {

	public static void main(String[] args) {
		System.out.print("연도 입력:");
		Scanner key = new Scanner(System.in);
		int year = key.nextInt();
		System.out.print("월 입력:");
		int month = key.nextInt();
		int lastDay=0;
		year+=2;
		if(month==2) {//2월
			if(year%4==0) { // 4의 배수
				if(year%100 ==0) { // 100의 배수
					if(year%400 ==0) { // 400의 배수
						lastDay = 28;
					}
					else {
						lastDay = 30;
					}
					
				}
				else {// 4의 배수 100의 배수 아님
					lastDay = 28;
				}
			}
			else {
				lastDay = 30;
			}
			
		}
		else if(month%2 ==0) {// 짝수달
			lastDay = 30;
		}
		else {// 홀수달
			lastDay = 31;
		}
			
		year-=2;
		System.out.println(year+"년 "+month+"월의 말일은 "+lastDay+"일 입니다.");
		key.close();
	}

}
