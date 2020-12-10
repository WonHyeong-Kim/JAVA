package chap05.constructor;

public class Rectangle2 {
	private int width;
	private int length;
	private String color;
	private int area;
	private int perimeter;
	
	public Rectangle2() {}
	
	public int area() {
		this.area = this.width * this.length;
		return area;
	}
	public int perimeter() {
		this.perimeter =(this.width + this.length)*2;
		return perimeter;
		
	}
	public void compareArea(Rectangle2 rec1, Rectangle2 rec2) {
		if(rec1.getArea() == rec2.getArea()) {
			System.out.println("넓이는 같습니다.");
		}else if(rec1.getArea() > rec2.getArea()) {
			System.out.println("넓이는 "+rec1.getColor()+" 직사각형이 더 큽니다.");
		}
		else {
			System.out.println("넓이는 "+rec2.getColor()+" 직사각형이 더 큽니다.");
		}		
	}
	public void comparePerimeter(Rectangle2 rec1, Rectangle2 rec2) {
		if(rec1.getPerimeter() == rec2.getPerimeter()) {
			System.out.println("둘레는 같습니다.");
		}else if(rec1.getPerimeter() > rec2.getPerimeter()) {
			System.out.println("둘레는 "+rec1.getColor()+" 직사각형이 더 큽니다.");
		}
		else {
			System.out.println("둘레는 "+rec2.getColor()+" 직사각형이 더 큽니다.");
		}		
	}
	public int getWidth() {
		return this.width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return this.length;
	}
	public void setLength(int length) {
		this.length = length;
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
	public int getPerimeter() {
		return this.perimeter;
	}
	public void setPerimeter(int perimeter) {
		this.perimeter = perimeter;
	}
}
