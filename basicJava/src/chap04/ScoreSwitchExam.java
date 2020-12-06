package chap04;

import java.util.Random;

public class ScoreSwitchExam {

	public static void main(String[] args) {
		//int num=-10;
		//int num=100;
		int num=89;
		Random rand = new Random();
		num = rand.nextInt(101);
		System.out.print(num+"점은 ");
		if(num>=0 & num<=100) {
			switch (num/10) {
			case 10:
			case 9:
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
				break;
			}
		}
		else {
			System.out.println("잘못된 입력.");
		}
	}

}
