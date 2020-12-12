package chap06;

public class Staff extends Person{
	private String dept;
	
	public Staff() {
		
	}
	
	public Staff(String name, int age, String dept) {
		super(name,age);
		this.dept=dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return this.dept;
	}
	public void print() {
		super.print();
		System.out.println("\t\t부      서 : "+getDept());
	}
}
