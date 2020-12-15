package chap09;

import java.io.FileInputStream;
import java.util.Scanner;
class Super{
	
}
class Sub extends Super{
	
}
//Exception이 발생하는 경우
public class ExceptionTest01 {

	public static void main(String[] args) {
		System.out.println("개발자가 실수할 수 있는 부분 *************************");
		//1. 0으로 나누는 경우 - ArithmeticException
		//System.out.println(10/0);
		//2. 배열의 index 참조를 잘목한 경우 - ArrayIndexOutOfBoundsException
		//System.out.println(args[0]);
		//3. null인 참조변수를 액세스해서 사용하려는 경우 - NullPointerException
		String str = null;
		//System.out.println(str.charAt(0));
		//4. 캐스팅 잘못한 경우 - ClassCastException
		Super obj = new Super();
		//Sub obj2 = (Sub)obj;
		System.out.println("사용자가 실수할 수 있는 부분 *************************");
		// 사용자가 잘못된 입력 - InputMismatchException
		Scanner key = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = key.nextInt();
		System.out.println("API에서 예외처리를 요구하는데 처리하지 않은 경우");
		/*
		 * API에서 예외처리를 문법적으로 요구하는 경우
		 * RuntimeException의 하위 Exception이 아닌 경우 반드시 문법적으로 예외에 대한 처리를 해야한다.
		 * 예외처리를 하지않으면 문법적으로 예외처리를 하도록 오류를 발생시킨다. (컴파일체크오류)
		 */
		Integer.parseInt("100"); // NumberFormatException은 runtime 하위 exception
		new String("java").getBytes(); // 예외 없음. 
		//new String().getBytes("java"); // UnsupportedEncodingException은 IOException하위 Exception. try catch문 구현 필요.
		//FileInputStream fs = new FileInputStream("test.txt"); // 
		

	}

}
