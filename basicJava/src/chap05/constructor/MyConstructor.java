package chap05.constructor;

public class MyConstructor {
	private String name;
	private String id;
	private String pass;
	private String addr;
	private String telNum;
	private String ssn;
	private String nickname;
	private int point;
	
	/*public void MyConstructor() {//일반 메소드
		
	}*/

	public MyConstructor(String name, String id, String pass) {
		this.name = name;
		this.id = id;
		this.pass = pass;
		System.out.println("매개변수 3개 생성자");
	}
	public MyConstructor(String name, String id, String pass, String addr,
			String telNum, String ssn, String nickname, int point) {
		this(name,id,pass);
		/*this.name = name;
		this.id = id;
		this.pass = pass;*/
		this.addr = addr;
		this.telNum = telNum;
		this.ssn = ssn;
		this.nickname = nickname;
		this.point = point;
		System.out.println("매개변수 8개 생성자");
		/*this(name,id,pass);*/
	}
	
	public MyConstructor() {
		System.out.println("매개변수가 없는 생성자-기본생성자");
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void print() {
		System.out.println("name => "+name+"\tid => "+id+"\tpass => "+pass);
	}
	
}
