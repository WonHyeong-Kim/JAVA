package chap04;

import java.util.Scanner;

// java.until패키지의 Scanner 클래스 테스트
// => 표준 입력 (키보드)으로 입력된 값을 읽어서 리턴하는 기능을 제공하는 클래스의 연습
// System.in : 표준입력(키보드 입력)
// System.out : 표준출력(모니터 출력)
public class ScannerTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in); // 표준입력으로 입력한 값을 저장하기 위해 System.in을 ()안에 정의
		
		// 한 문장을 읽기 위한 메소드
		System.out.println("키보드를 이용하여 메시지를 입력하세요:");
		String line = key.nextLine();
		System.out.println("입력받은 라인=>"+line);
		
		System.out.println("숫자를 입력:");
		int num = key.nextInt();
		System.out.println("입력받은 숫자"+num);
		
		System.out.println("단어 입력:");
		String data = key.next();
		System.out.println("입력받은 단어"+data);
		// next()는 키보드로 입력한 단어를 읽기 위한 메소드
		// 공백입력 전의 문자열을 단어로 인식
		
		System.out.print("숫자를 입력:");
		int num2 = key.nextInt();
		System.out.println("입력받은 숫자"+num2);
		key.close();
	}

}
