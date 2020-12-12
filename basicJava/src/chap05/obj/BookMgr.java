package chap05.obj;
public class BookMgr {
	private Book[] booklist;
	public BookMgr() {
		
	}
	public BookMgr(Book[] booklist) {
		this.booklist=booklist;
	}
	
	public void printBooklist(){
		for(int i=0;i<this.booklist.length;i++) {
			System.out.println(booklist[i].getTitle());
		}
	}
	
	public void printTotalPrice(){
		int sum=0;
	
		for(int i=0;i<this.booklist.length;i++) {
			sum+=booklist[i].getPrice();
		}
		System.out.println("전체 책 가격의 합 : "+sum);

	}
}
