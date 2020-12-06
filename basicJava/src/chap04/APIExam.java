package chap04;

import java.util.Random;
//import java.util.StringTokenizer;

public class APIExam {

	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println("랜덤수 :"+rand.nextInt());
		
		//StringTokenizer token;
		
		System.out.println("랜덤수 :"+rand.nextInt(100));
		// 0~99까지
	}

}
