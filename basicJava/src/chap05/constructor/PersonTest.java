package chap05.constructor;

public class PersonTest {

	public static void main(String[] args) {
		// 객체 생성 - 인스턴스화
		Person p1=new Person("이이",23,"서울");
		System.out.println(p1);
		p1.setTelNum("010");
		System.out.println("성명:"+p1.getName());
		System.out.println("나이:"+p1.getAge());
		System.out.println("주소:"+p1.getAddr());
		System.out.println("====================");
		
		Person p2 = new Person("하하",27,"인천");
		System.out.println(p2);
		System.out.println("성명:"+p2.getName());
		System.out.println("나이:"+p2.getAge());
		System.out.println("주소:"+p2.getAddr());
		System.out.println("====================");
		
		Person p3 = new Person("므므",25,"경기도");
		System.out.println(p3);
		System.out.println("성명:"+p3.getName());
		System.out.println("나이:"+p3.getAge());
		System.out.println("주소:"+p3.getAddr());
	}

}