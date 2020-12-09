package chap05.obj;

public class MyMethod {
	// 1. 매개변수가 없고 리턴타입이 없는 메소드
	public void display() {
		for(int i=0; i<10;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	// 2. 매개변수가 있고 리턴타입이 없는 메소드
	// 매개변수는 메소드를 유연하게 만든다.(한가지만 처리하지 않도록 하기 때문에 다양한 곳에서 호출이 가능)
	// 매개변수 개수나 타입을 다르게 정의한 메소드명을 동일하게 사용할 수 있다. - 메소드 오버로딩
	public void display(String str) {
		for(int i=0; i<10;i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	// 3. 매개변수가 있고 리턴타입이 있는 메소드
	public void display(String str, int count) {
		for(int i=0; i<count;i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	// 4. 매개변수가 있고 리턴타입이 있는 메소드
	public int add(int num1, int num2) {
		int result=0;
		result = num1+num2;
		return result;
	}
	
}
