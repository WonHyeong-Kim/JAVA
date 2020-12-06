package chap02;
//{} 안에 선언하는 변수를 로컬 변수. 자바에는 전역변수의 개념이 없다.

public class LocalVariableTest {
	public static void main(String[] args) {
		// 1. 지역변수를 사용하는 경우 반드시 초기화 작업을 하고 사용해야한다.
		//int val;
		//System.out.println(val);
		int data=100;
		System.out.println(data);
		if(data>=100) {
			//2. {}안에서 선언된 변수는 {}안에서만 사용할 수 있다.
			int data2=200;
			System.out.println(data2);
		}
		//System.out.println(data2);
	}
}
