package chap06.poly;

public class Circle extends Shape {
	private double radius;
	public Circle() {
		
	}
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	public void calculationArea() {
		area = Math.PI * Math.pow(radius,2);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
