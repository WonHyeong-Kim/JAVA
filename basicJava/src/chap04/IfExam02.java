package chap04;

import java.util.Scanner;

public class IfExam02 {

	public static void main(String[] args) {
		int age = 12;
		int gender = 1; // 1은 남자 2는 여자
		String result="";
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		age = key.nextInt();
		System.out.print("성별을 입력하세요(1-남자, 2-여자) : ");
		gender = key.nextInt();
		
		
		if(age >= 20) {
			result+="성인";
			if(gender == 1) {
				result+="남자";
			}
			else if(gender == 2) {
				result+="여자";
			}
		}
		else {
			result+="청소년";
			if(gender == 1) {
				result+="남자";
			}
			else if(gender == 2) {
				result+="여자";
			}
		}
		System.out.println(result);
		key.close();
	}

}
