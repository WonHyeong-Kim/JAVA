package chap05.exam;

public class Sparrow {
	private String name;
	private int legs;
	private int length;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public int getLegs() {
		return this.legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getLength() {
		return this.length;
	}
	public void fly() {
		System.out.println("참새("+this.name+")는 날아다닙다.");
	}
	public void sing() {
		System.out.println("참새("+this.name+")가 소리내어 웁니다.");
	}
	public String toString() {
		return ("참새의 이름은 "+this.name+"입니다.");
	}
}
