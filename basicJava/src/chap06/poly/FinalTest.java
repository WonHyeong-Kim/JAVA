package chap06.poly;
//final키워드
/* 
 * 변수 - 변수를 상수로 정의
 * 메소드 - 오버라이딩 할 수 없는 메소드
 * 클래스 - 상속을 할 수 없는 클래스
 */
final class AA{
	public final void display() {
		System.out.println("상위의 display");
	}
}
/*
class BB extends AA{//AA가 final클래스이므로 상속을 받을 수 없다.
	public void display() {//부모가 갖고 있는 display를 재정의(오버라이딩)
		                   //final이 추가된 메소드는 오버라이딩할 수 없다.
		System.out.println("하위의 display");
	}
}
*/
public class FinalTest {
	int num=1000;//일반변수 - 계속 바뀌는 값을 저장하는 변수
	public final static int START_CODE = 2000;//상수 - 절대 변경되지 않는 값을 저장하는 변수
	                                          //관용적으로 상수는 대문자로 정의
	public void change() {
		num = 200;
		//START_CODE = 3000;//상수는 값을 변경할 수 없다.
	}
	public static void main(String[] args) {
		
	}

}
