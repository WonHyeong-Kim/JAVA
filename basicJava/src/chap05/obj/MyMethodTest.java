package chap05.obj;

public class MyMethodTest {

	public static void main(String[] args) {
		MyMethod m = new MyMethod();
		System.out.println("====업무시작====");
		System.out.println("작업1");
		// 1. 매개변수가 없고 리턴타입이 없는 메소드의 호출
		m.display();
		System.out.println("작업2");
		m.display();
		// 2. 매개변수가 1개 이고 리턴값이 없는 메소드의 호출
		m.display("★");
		m.display("○");
		// 3. 매개변수가 여러 개인 메소드의 호출 - 매개변수가 여러 개인 경우 ,로 구분해서 값을 정의
		// 반드시 선언된 순서와 동일하게 값을 넘겨줘야한다.
		m.display("★",20);
		m.display("○",30);
		// 4. 매개변수가 있고 리턴타입이 있는 메소드의 호출
		int num = m.add(200,300);
		System.out.println("add메소드의 호출결과 => "+num);
		//리턴값을 갖고 있는 메소드는 다른 메소드의 매개변수로 바로 전달할 수 있다.
		System.out.println(m.add(200,300));
		
	}

}
