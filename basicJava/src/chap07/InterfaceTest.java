package chap07;
/*
 * <<인터페이스>>
 * 	=> 추상메소드와 상수만 정의할 수 있는 특별한 클래스
 *     인터페이스를 사용하는 목적은 다형성을 적용할 수 있으며 다중상속과 동일하게 구현이 가능하다. 
 * 	=> 상위클래스로 사용하기 위한 목적
 * 	=> 타입으로 사용하기 위한 목적
 *  1. 인터페이스는 interface키워드를 이용해서 선언
 *  2. 인터페이스는 추상메소드만 정의하는 클래스
 *     - 하위클래스에서 상속하고 오버라이딩하면 자동으로 public이 추가되므로 메소드를 정의할 때  public abstract은 생략이 가능
 *  3. 클래스가 인터페이스를 상속하는 경우 implements키워드를 이용해서 상속(구현)
 *  4. 인터페이스끼리 상속이 가능하며 인터페이스가 인터페이스를 상속하는 경우 extends를 이용  
 *  5. 인터페이스끼리 상속하는 경우 다중상속이 가능 - 여러 개의 인터페이스를 ,로 연결해서 동시에 상속할 수 있다.
 *     extends 인터페이스A,인터페이스B....{
 *     }
 *  6. 클래스가 인터페이스를 상속하는 경우에도 다중 상속이 가능 - 여러 개의 인터페이스를 ,로 연결해서 동시에 상속할 수 있다.
 *  7. 클래스와 인터페이스를 동시에 상속하는 경우 클래스의 상속을 인터페이스의 상속보다 먼저 정의한다.
 *     extends가 implements보다 먼저 선언되어야 한다.
 */
interface SuperInterA{
	void show();//추상메소드
}
interface InterA extends SuperInterA{
	void test();
	void display();
}
interface InterB{
	void change();
}
interface InterC extends InterA,InterB{
	void test2();
}
interface InterD{
	
}
class SuperClassA{//상속받을 클래스
	
}
class SubClassA extends SuperClassA implements InterC, InterD {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void change() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceTest {
	public static void main(String[] args) {

	}

}
