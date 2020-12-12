package chap05.obj;

public class Student2 {
	private String name;
	private int age;
	private int id;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/*public void setName(String name) {
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
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}*/
	public void print() {
		System.out.println("이   름 : "+this.name+"\t나 이 : "+this.age+"\t\t학      번 : "+this.id);
	}
}
