package chap05.constructor;

//import java.util.Scanner;

public class MyConstructorTest {

	public static void main(String[] args) {
		// 객체생성을 하면 생성자 메소드가 호출되며 생성자 메소드 안에 정의한 코드가 실행된다.
		MyConstructor obj = new MyConstructor();
		//Scanner key = new Scanner(System.in);
		obj.setName("이이이");
		obj.setId("lee");
		obj.setPass("123");
		obj.print();
		
		MyConstructor obj2 = new MyConstructor("하하","ha","234");
		obj2.print();
		
		/*System.out.print("성명:");
		String name = key.next();
		
		System.out.print("id:");
		String id = key.next();
		
		System.out.print("password:");
		String pass = key.next();
		
		MyConstructor obj3 = new MyConstructor(name,id,pass);
		obj3.print();
		*/
		MyConstructor obj4 = new MyConstructor("크크크", "qqwqw", "1222", "서울", "010", "11111", "zxdsad", 100);
		obj4.print();
	}

}
