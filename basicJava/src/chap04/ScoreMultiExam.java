package chap04;

import java.util.Random;

public class ScoreMultiExam {
	public static void main(String[] args) {
		//int num=10;
		int num=0;
		
		Random rand = new Random();
		num = rand.nextInt(101);
		System.out.print(num+"점은 ");
		
		if(num>=0 & num<=100) {
			if(num>=90) {
				System.out.println("A학점");
			}
			else if(num>=80) {
				System.out.println("B학점");
			}
			else if(num>=70) {
				System.out.println("C학점");
			}
			else if(num>=80) {
				System.out.println("D학점");
			}
			else {
				System.out.println("F학점");
			}
		}
		else {
			System.out.println("잘못된 입력.");
		}
	}
}
