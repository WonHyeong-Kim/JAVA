package chap06;

class Parent{
	public void display() {
		System.out.println("부모클래스의 display()");
	}
	
}
class Child extends Parent{
	public void test() {
		System.out.println("자식클래스의 test()");
		display();
		super.display();
	}
	public void display() {
		System.out.println("자식클래스의 display()");
	}
}

public class InheritanceTest02 {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.test();
		obj.display();
	}
}
