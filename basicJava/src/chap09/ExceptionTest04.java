package chap09;

import java.util.InputMismatchException;
import java.util.Scanner;
// try catch catch
// catch블록을 다중으로 선언하고 사용하는 것이 가능
// 단, 상위 Exception에 대한 처리는 가장 마지막 블럭으로 처리한다.
public class ExceptionTest04 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		try {
			System.out.println("start");
			System.out.println("숫자를 입력하세요");
			int num1 = key.nextInt();
			System.out.println("나눌 숫자를 입력하세요");
			int num2 = key.nextInt();
			System.out.println("결과=>"+(num1/num2));
			System.out.println("end");
		}/*catch(Exception e){
			System.out.println("기타예외");
		}*/catch(ArithmeticException e) {
			System.out.println("예외발생");
			System.out.println("0으로 나눴습니다.");
			
		}catch(InputMismatchException e) {
			System.out.println("문자를 입력하셨습니다.");
			
		}catch(Exception e){
			System.out.println("기타예외");
		}
		System.out.println("restart");
	
	}
}
