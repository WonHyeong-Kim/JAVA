package chap05.obj;

public class PersonTest {

	public static void main(String[] args) {
		// 객체 생성 - 인스턴스화
		Person p1=new Person();
		System.out.println(p1);
		p1.setName("이이");
		
		p1.setAge(23);
		p1.setAddr("서울");
		p1.setTelNum("010");
		System.out.println("성명:"+p1.getName());
		System.out.println("나이:"+p1.getAge());
		System.out.println("주소:"+p1.getAddr());
		System.out.println("====================");
		Person p2 = new Person();
		System.out.println(p2);
		p2.setName("하하");
		p2.setAge(26);
		p2.setAddr("인천");
		System.out.println("성명:"+p2.getName());
		System.out.println("나이:"+p2.getAge());
		System.out.println("주소:"+p2.getAddr());
		System.out.println("====================");
		Person p3 = new Person();
		System.out.println(p3);
		p3.setName("므므");
		p3.setAge(25);
		p3.setAddr("경기도");
		System.out.println("성명:"+p3.getName());
		System.out.println("나이:"+p3.getAge());
		System.out.println("주소:"+p3.getAddr());

	}

}