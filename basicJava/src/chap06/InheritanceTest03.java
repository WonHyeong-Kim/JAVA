package chap06;
class SuperA{
	private String name;
	SuperA(){
		System.out.println("부모의 생성자");
	}
	SuperA(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
}
class SubA extends SuperA{
	int age;
	String addr;
	SubA(){
		super();
		System.out.println("자식의 기본생성자");
	}
	SubA(String name, int age, String addr){
		super(name);
		this.age = age;
		this.addr=addr;
	}
	public void display() {
		System.out.println("name=>"+getName()+"\t age=>"+age+"\taddr=>"+addr);
	}
}
public class InheritanceTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubA obj = new SubA("이이", 40,"서울");
		obj.display();
	}

}
