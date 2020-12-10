package chap05.constructor;

public class Teacher {
	private String name;
	private int age;
	private String subject;
	public Teacher() {
		
	}
	/*public Teacher(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}*/
	
	public Teacher(String name, int age, String subject) {
		super();
		this.name = name;
		this.age = age;
		this.subject = subject;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return this.subject;
	}
	public void print() {
		System.out.println("이   름 : "+this.name+"\t나 이 : "+this.age+"\t\t담당과목 : "+this.subject);
	}

}
