package chap05.obj;
//public클래스의 클래스명과 파일명을 동일하게 해야 한다.
class Point{
	int x = 10;
	int y = 20;
}
public class MethodArgsTest02 {
	public static void main(String[] args) {
		int i = 1000;
		Point main_p = new Point();
		String mainStr =new String("java");
		display(i, main_p,mainStr);
		change(i, main_p,mainStr);
		System.out.println("==================================");
		display(i, main_p,mainStr);
	}	
	public static void display(int x, Point p,String str) {
		System.out.println("x=>"+x);
		System.out.println("Point객체의 x=>"+p.x+",Point객체의 y=>"+p.y);
		System.out.println("String값=>"+str);
	}
	public static void change(int x,Point p,String str) {
		x = 3000;
		int temp = p.x;
		p.x = p.y;
		p.y = temp;
		str = "myjava";
	}
}
