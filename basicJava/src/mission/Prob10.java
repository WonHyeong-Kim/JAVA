package mission;

import java.util.Scanner;

public class Prob10 {
	static String printSeason(int month) {
		String result="";
		switch (month) {
		case 3:
		case 4:
		case 5:
			result="봄";
			break;
		case 6:
		case 7:
		case 8:
			result="여름";
			break;
		case 9:
		case 10:
		case 11:
			result="가을";
			break;
		case 12:
		case 1:
		case 2:
			result="겨울";
			break;

		default:
			return "1~12 사이의 숫자만 입력하셔야 합니다.";
		}
		result+="에 태어나셨네요.";
		return result;
	}
	public static void main(String[] args) {
		System.out.print("태어난 월을 입력하세요: ");
		Scanner key = new Scanner(System.in);
		int month = key.nextInt();
		String result = printSeason(month);
		System.out.println(result);
		key.close();
	}

}
