package chap05.constructor;

public class Person {
	
	private String name;//멤버 변수, 필드
	private int age;
	private String addr;
	private String telNum;
	
	public Person() {
		
	}
	public Person(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	// name변수를 액세스 하기 위한 메소드를 구현
	/* setter 메소드와 getter메소를 정의하는 방법
	 * set(get)+멤버변수명(멤버변수의 첫글자를 대문자로 변경)
	 * 
	 * 기본 자바에서는 getter나 setter메소드의 이름을 정해진 약속대로 작성하지않아도 문제될 것이 없으나
	 * 스프링이나 웹에서 이 명명규칙을 지키지않으면 오류가 발생한다.
	 * 
	 * */
	
	
	//1. name 변수에 외부에서 전달하는 값을 셋팅하기 위한 메소드 - setter
	public void setName(String name) {
		this.name = name; // 멤버변수 name = 지역변수(매개변수) name
	}
	
	//2. name 변수에 저장된 값을 외부에 전달하는 메소드 - getter
	public String getName() {
		return this.name;
		//return name; // 안붙여도 가능
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr() {
		return this.addr;
	}
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	public String getTelNum() {
		return this.telNum;
	}
}
