package chap06;

public class Person {
	private String name;
	private int age;
	public Person() {
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	public void print() {
		System.out.print("이   름 : "+getName()+"\t나 이 : "+getAge());
	}
}
