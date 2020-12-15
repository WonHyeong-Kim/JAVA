package chap07;

interface TestA{
	
}
interface TestB{
	
}
class A{
	
}
class B extends A implements TestA,TestB{
	
}
class C extends A implements TestA{
	
}
public class InterfaceTest2 {
	public static void main(String[] args) {
		B obj = new B();
		C obj2 = new C();
		run1(obj);
		run2(obj);
		run3(obj);
		//instanceof - 객체가 클래스타입인지 체크하는 연산자
		//               - 해당타입
		if(obj instanceof A) {
			System.out.println("A의 하위객체(A타입이다. )");
		}else {
			System.out.println("A의 하위객체가 아니다.");
		}
		if(obj instanceof TestA) {
			System.out.println("TestA의 하위객체(TestA타입이다.)");
		}else {
			System.out.println("TestA의 하위객체가 아니다.");
		}
		if(obj instanceof TestB) {
			System.out.println("TestB의 하위객체(TestB타입이다.)");
		}else {
			System.out.println("TestB의 하위객체가 아니다.");
		}
		if(obj2 instanceof TestB) {
			System.out.println("TestB의 하위객체(TestB타입이다.)");
		}else {
			System.out.println("TestB의 하위객체가 아니다.");
		}
	}
	public static void run1(A obj) {
		
	}
	public static void run2(TestA obj) {
		
	}
	public static void run3(TestB obj) {
		
	}
}






