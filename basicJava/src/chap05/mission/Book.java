package chap05.mission;
public class Book {
	private String title;
	private int price;
	public Book() {
		
	}
	public Book(String title, int price) {
		this.title=title;
		this.price=price;
		
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
