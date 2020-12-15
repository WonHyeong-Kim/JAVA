package chap06.poly;
/*
 * 추상클래스
 * => 미완성된 클래스 즉, 모든 내용이 구현되어 있지 않은 클래스로 완성되지 않았으므로 객체를 생성할 수 없다.
 *                     --------------------------
 *                         내용이 정의되지 않은 메소드를 갖고 있는 클래스
 *                            |
 *                            |___ 추상메소드(body가 없는 메소드)
 *   1) 추상메소드를 선언하는 방법
 *      접근제어자 abstract 리턴타입 메소드명(매개변수list.....);
 *      
 *      => 추상메소드를 정의하면 클래스도 미완성된 클래스 즉, 추상클래스가 되므로 클래스 선언부에 반드시 abstract키워드를 추가해야 한다.
 *      
 *   2) 추상클래스의 특징
 *      - 일반메소드, 추상메소드, 일반멤버변수 모두 정의할 수 있다.
 *      - 추상메소드가 하나라도 있으면 추상클래스이므로 abstract을 클래스 선언부에 추가한다.
 *      - 추상클래스는 객체 생성을 할 수 없다. (상위클래스로 사용할 목적으로 설계)
 *      - 추상클래스를 상속받은 클래스는 에러가 발생???????? 
 *        => Sub가 Super를 상속받으면 Super의 모든 멤버가 Sub의 소유가 된다.
 *           그러므로 Sub는 추상메소드를 갖게 된다.
 *       
 *        [해결방법]
 *        1. Sub클래스에 abstract을 추가    
 *        2. abstract클래인 상위클래스가 갖고 있는 추상메소드를 오버라이딩해서 body를 구현
 *            
 *                               
 *                               ?????????? 어디에 쓰는지???????
 */
abstract class Super{
	public void test() {
		System.out.println("test()");
	}
	public abstract void display();
}
class Sub extends Super{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}
public class AbstractTest {
	public static void main(String[] args) {
		//Super obj = new Super();
	}
}
