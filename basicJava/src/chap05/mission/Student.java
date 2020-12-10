package chap05.mission;

public class Student {
	public static void main(String args[]) {
		Student stu = new Student("장동건", "jspprogram", 500000);
		stu.calcReturnFee();
		stu.print();
	}
	private String name;
	private String subject;
	private int fee;
	private double returnFee;
	public Student(String name, String subject, int fee){
		this.name=name;
		this.subject=subject;
		this.fee=fee;
	}
	public void calcReturnFee() {
		if(this.subject == "javaprogram") {
			this.returnFee = this.fee*0.25;
		}
		else if(this.subject == "jspprogram"){
			this.returnFee=this.fee*0.2;
		}
		else {
			System.out.println("그런 과정명은 없습니다.");
		}
		
	}
	public void print() {
		System.out.println(name+"씨의 과정명은 "+subject+"이고 교육비는 "+fee+"이며 환급금은 "+returnFee+"입니다.");
	}
}
