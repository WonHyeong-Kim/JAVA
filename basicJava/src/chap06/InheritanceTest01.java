package chap06;

class Super{
	//private int num=100; // private면 자식에서 호출못함
	int num=100;
}
class Sub extends Super{
	int num =1000;
	public void display() {
		System.out.println("num => "+num);
		System.out.println("super.num => "+super.num);
	}
}
public class InheritanceTest01 {
	public static void main(String[] args) {
		Sub obj = new Sub();
		obj.display();
		System.out.println(obj.num);
		Super obj2 = new Super();
		//System.out.println(obj2.num);
		


	}

}
