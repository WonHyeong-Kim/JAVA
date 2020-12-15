package chap07;
class Parent{
	
}
interface ParentA{
	
}
class ChildA extends Parent{
	
}
class ChildB extends Parent{
	
}
class ChildC extends Parent implements ParentA{
	
}
public class InstanceOfTest {
	public static void main(String[] args) {
		test(new ChildA());
		test(new ChildB());
		test(new ChildC());
	}
	public static void test(Parent obj) {
		if(obj instanceof ChildA) {
			System.out.println("ChildA ------- ChildA타입");
		}else if(obj instanceof ChildB) {
			System.out.println("ChildB ------- ChildB타입");
		}else if(obj instanceof ChildC) {
			System.out.println("ChildC ------- ChildC타입");
		}
	}
}
