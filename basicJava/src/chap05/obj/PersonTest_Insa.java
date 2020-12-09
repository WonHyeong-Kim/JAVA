package chap05.obj;

import java.util.Scanner;

public class PersonTest_Insa {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("==========인사관리==============");
		System.out.println("1. 사원등록");
		System.out.println("2. 사원조회");
		System.out.println("3. 사원삭제");
		System.out.println("4. 사원정보수정");
		System.out.println("5. 사원 목록조회");
		System.out.print("원하는 작업을 선택하세요:");
		int job = key.nextInt();
		switch (job) {
		case 1:
			System.out.println("======사원등록=======");
			System.out.print("성명:");
			String name = key.next();
			System.out.print("나이:");
			int age = key.nextInt();
			System.out.print("주소:");
			String addr = key.next();
			Person_Before p1=new Person_Before();
			p1.name=name;
			p1.age=age;
			p1.addr=addr;
			System.out.println("성명:"+p1.name);
			System.out.println("나이:"+p1.age);
			System.out.println("주소:"+p1.addr);
			break;
		case 2:
			System.out.println("======사원등록=======");
			break;
		case 3:
			System.out.println("======사원조회=======");
			break;
		default:
			break;
		}
		

	}

}
