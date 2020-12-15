package chap06.poly;
//객체의 형변환 - 상속관계에 있는 경우에만 형변환이 가능하다.
class Parent{
	String name = "장동건";
	public void display() {
		System.out.println("super의 display");
	}
}
class Child extends Parent{
	String name = "이민호";
	public void display() { //오버라이딩된 메소드
		System.out.println("sub의 display");
	}
	public void show() {
		System.out.println("show");
	}
}
public class RefTypeCastingTest {
	public static void main(String[] args) {
		System.out.println("1. super타입의 참조변수로 super객체를 접근");
		Parent obj1 = new Parent();
		obj1.display();
		System.out.println(obj1.name);
		System.out.println("*****************************************");
		
		System.out.println("2. sub타입의 참조변수로 sub객체를 접근");
		Child obj2 = new Child();
		obj2.display();
		System.out.println(obj2.name);
		System.out.println("*****************************************");
		
		/*
		 * 객체의 형변환
		 * Sub객체는 자동으로 Super타입으로 변환된다.
		 * => 기본형은 사이즈가 작은 타입의 데이터를 사이즈가 큰 타입의 변수에 할당하는 것이 가능했고 자동으로 캐스팅이 진행
		 *    참조형의 형변환은 상속관계에 있는 경우 상위타입의 변수가 하위타입의 객체를 참조하는  경우 자동으로 형변환이 일어난다.
		 *    부모타입 변수 = new 자식객체()
		 *     
		 *    1) 오버라이딩된 메소드가 있는 경우 오버라이딩된 메소드가 우선으로 인식된다.
		 *    2) 오버라이딩된 메소드를 빼면 무조건 참조변수의 타입을 기준으로 모든 멤버를 접근할 수 있다. 
		 */
		System.out.println("3. super타입의 참조변수로 sub객체를 접근");
		//Child를 Parent로 변환해야 하는데 Child에는 Parent정보가 있으므로 변환이 가능
		Parent obj3 = new Child();
		obj3.display(); // Child
		System.out.println(obj3.name); // Parent
		//참조하고 있는 객체는 Child이지만 실제 이 객체를 참조하는 변수의 타입이 Parnet이므로 Parnet 의 멤버만 접근할 수 있다.(오버라이딩된 메소드 빼고)
		//obj3.show(); // Parent
		
		//단, 참조변수의 타입이 부모타입이지만 실제 생성된 객체가 하위 객체인 경우에는 명시적으로 하위타입으로 형변환을 해서 접근할 수 있다.
		((Child)obj3).show(); // Child
		System.out.println("************************************************************");
		
		System.out.println("4. sub타입의 참조변수로 super객체를 접근-------X");
		//obj4는 형변환을 할 수 없다. Parent를 Child로 변환해야 하는 Parent에는 Child정보가 없으므로 변환이 불가능
		//Child obj4 = new Parent();
		System.out.println("************************************************************");
		
		//명시적으로 캐스팅하면 컴파일러는 속일 수 있다.(단, 상속관계에 있는 경우에만 가능)
		//컴파일러는 속였으나 실제 실행될때 obj1이 Parent를 참조하고 있으므로 Child로 타입을 변환할 수 없다.
		System.out.println("5. sub타입의 참조변수 = Super객체를 참조하는 Super타입의 변수 --------X");
		//Child obj5 = (Child)obj1;
		System.out.println("************************************************************");
		
		//obj3이 parnet타입이지만 실제 참조하는 객체가 Child이므로  Child로 변환이 가능 
		System.out.println("6. sub타입의 참조변수 = Sub객체를 참조하는 super타입의 변수-------O");
		Child obj6 = (Child)obj3;
		obj6.display();
		System.out.println(obj6.name);
	}
}







