package chap05.obj;

public class StaticDemo02 {
	int num; // 객체의 고유값
	static int staticNum; // 객체의 공유값
	public static void test() {
		// 1. static 메소드에서 static 메소드 호출 - 일반적인 방법으로 접근 가능
		show();
		System.out.println("test"+staticNum);
	}
	
	public void display() {
		// 2. non-static 메소드에서 non-static 메소드 호출 - 일반적인 방법으로 접근 가능
		play();
		System.out.println("display"+num);
	}
	
	public void change() {
		// 3. non-static 메소드에서 static 메소드 호출 - 일반적인 방법으로 접근 가능
		test();
		System.out.println("change");
	}
	
	public static void show() {
		// 4. static 메소드에서 non-static 메소드 호출
		// static메소드에서 non-static메소드를 호출하려면 자신 객체라 하더라도 객체를 생성해서 호출 해야한다.
		StaticDemo02 obj = new StaticDemo02();
		obj.play();
		System.out.println("show");
	}
	
	public void play() {
		
	}
}
