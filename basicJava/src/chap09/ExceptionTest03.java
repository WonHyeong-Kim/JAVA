package chap09;

import java.util.Scanner;

public class ExceptionTest03 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		try {
			//예외발생가능성이 있는 코드
			// 예외가 발생되지않으면 catch블록이 실행되지않는다.
			System.out.println("start");
			System.out.println("숫자를 입력하세요");
			int num1 = key.nextInt();
			System.out.println("나눌 숫자를 입력하세요");
			int num2 = key.nextInt();
			System.out.println("결과=>"+(num1/num2));
			System.out.println("end");
		}catch(Exception e) { // Exception 다형성
			// 예외처리코드
			// 예외가 발생되면 try블럭이 끝까지 실행되지 못하고 catch가블럭으로 제어가 넘어온다.
			System.out.println("예외발생");
			System.out.println("예외메시지"+e.getMessage());
			// 개발시에 가장 많이 사용하는 메소드
			// 여러 클래스를 이용해서 작업하는 경우 어떤 클래스에서 오류가 발생했는지 알아야할 필요성이 있다.
			// printStackTrace() : 예외발생시 오류발생 클래스와 오류 라인을 출력. 
			e.printStackTrace();
		}
		System.out.println("restart");
	
	}
}
