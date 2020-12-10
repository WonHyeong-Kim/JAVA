package chap05.constructor;

public class Rectangle {
	private int width;
	private int height;
	private String color;
	private int area;
	
	public Rectangle() {
		this.color="흰색";
	}
	public Rectangle(int width, int height) {
		this();
		this.width=width;
		this.height=height;
	}
	public Rectangle(int width, int height, String color) {
		this(width,height);
		this.color=color;
	}
	public void calculateArea() {
		this.area = this.width * this.height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getArea() {
		return this.area;
	}
	public void setArea(int area) {
		this.area = area;
	}
}
