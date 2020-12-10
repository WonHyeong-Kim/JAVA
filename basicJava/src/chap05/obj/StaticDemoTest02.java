package chap05.obj;

public class StaticDemoTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo02 obj =new StaticDemo02();
		obj.display(); // 객체의 non-static메소드를 외부에서 접근하는 경우 참조변수로 액세스
		StaticDemo02.show(); // 객체읭 static메소드는 외부에서 접근하는 경우 클래스 이름으로 액세스
		
		StaticDemoTest02 obj2 = new StaticDemoTest02(); 
		obj2.test();
		test2();
	}
	public void test() {
		
	}
	public static void test2() {
	
	}

}
