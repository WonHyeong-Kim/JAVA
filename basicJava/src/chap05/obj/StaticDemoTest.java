package chap05.obj;

import java.util.Random;

public class StaticDemoTest {

	public static void main(String[] args) {
		StaticDemo obj1 = new StaticDemo();
		obj1.display();
		System.out.println(obj1.num+StaticDemo.staticNum);
		/*
		 * num은 인스턴스 변수이므로 객체 참조 변수인 obj1을 이용해서 액세스가 가능 (num은 obj1의 소유)
		 * staticNum은 객체가 생성될때 마다 객체 내부에 새롭게 만들어지는 변수가 아니라 클래스가 처음 메모리에 로딩될때
		 * 한번만 static영역에 로딩되는 변수이므로 객체의 소유가 될 수 없다.
		 * 따라서 static이 붙은 변수는 인스턴스변수를 통해서 접근하지 않고 클래스명으로 접근해야한다.
		 * 모든 static멤버는 무조건 클래스 이름을 접근해야한다.
		*/
		StaticDemo obj2 = new StaticDemo();
		obj2.display();
		
		StaticDemo obj3 = new StaticDemo();
		obj3.display();
		Integer.parseInt("2");
		Math.abs(1);
		double a =Math.PI;
		Random rand = new Random();
		rand.nextInt();
		/*
		 * API 사용 시 static 메소드/변수인지 확인하여 static이면 class명.메소드명/변수명으로 사용한다.
		 * 아닐 경우 인스턴스 변수를 선언하여 사용한다. (new)
		*/
	}

}
