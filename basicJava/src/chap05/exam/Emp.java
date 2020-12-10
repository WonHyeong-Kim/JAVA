package chap05.exam;

public class Emp {
	private String id;
	private String name;
	private int baseSalary;
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	public int getBaseSalary() {
		return this.baseSalary;
	}
	public double getSalary(double bonus) {
		double salary = baseSalary+baseSalary*bonus;
		return salary;
	}
	public String toString() {
		return (this.name+"("+this.id+") 사원의 기본급은 "+this.baseSalary+"원입니다.");
	}
}
