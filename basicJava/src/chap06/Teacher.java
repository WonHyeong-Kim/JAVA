package chap06;

public class Teacher extends Person{
	
	private String subject;
	public Teacher() {
		
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getSubject() {
		return this.subject;
	}
	public Teacher(String name, int age, String subject) {
	super(name, age);
	this.subject = subject;
}

	public void print() {
		super.print();
		System.out.println("\t\t담당과목 : "+this.subject);
	}

}
