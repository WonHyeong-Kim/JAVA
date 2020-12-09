package chap05.obj;

public class PersonTest {

	public static void main(String[] args) {
		// 객체 생성 - 인스턴스화
		Person_Before p1=new Person_Before();
		System.out.println(p1);
		p1.name="자아아";
		p1.age=23;
		p1.addr="서울";
		p1.telNum="010"; // private는 외부 클래스에서 접근할 수 없다.
		System.out.println("성명:"+p1.name);
		System.out.println("나이:"+p1.age);
		System.out.println("주소:"+p1.addr);
		System.out.println("====================");
		Person_Before p2 = new Person_Before();
		System.out.println(p2);
		p2.name="하하아";
		p2.age=26;
		p2.addr="인천";
		System.out.println("성명:"+p2.name);
		System.out.println("나이:"+p2.age);
		System.out.println("주소:"+p2.addr);
		System.out.println("====================");
		Person_Before p3 = new Person_Before();
		System.out.println(p3);
		p3.name="디디";
		p3.age=25;
		p3.addr="경기도";
		System.out.println("성명:"+p3.name);
		System.out.println("나이:"+p3.age);
		System.out.println("주소:"+p3.addr);

	}

}
