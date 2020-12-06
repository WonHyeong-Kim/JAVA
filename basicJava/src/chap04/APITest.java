package chap04; // 패키지 선언문
// java 컴파일러가 java.util패키지를 기본으로 인식하지 못해서 Random클래스를 사용하려면 오류가 발생한다.
// 컴파일러가 기본으로 인식하는 패키는 현재 클래스가 저장되어 있는 패키지와 java.lang 패키지만 자동인식
//import java.util.Random;

public class APITest { // 클래스 선언문

	public static void main(String[] args) {
		//int num =100;
		// 자바언어에서 제공되는 API를 이용해서 개발
		//String str = new String("문자열 초기값");
		// java라는 문자열을 처리하기 위해서 String클래스를 메모리에 할당
		// 즉, String 클래스의 charAt이라는 기능(메소드)을 사용하기 위해서 JVM이 인식하는 작업 공간인
		// heap에 string클래스를 할당하고 
		// 할당된 주소를 str변수에 저장
		String str = new String("java");
		// str에 저장된 String클래스의 주소를 참조해서 charAt메소드를 호출
		char result= str.charAt(0);
		System.out.println(result);
		
		
		String s = new String("i love java");
		System.out.println("결과=>"+s.length());
		
		// random 클래스를 이용 - 랜덤수를 관리하는 기능을 제공하는 클래스
		//Random r = new Random();
		
	}

}
