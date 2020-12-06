package chap02;

public class VariableTest {
	public static void main(String[] args) {
		System.out.println("test");
		int num1=100;
		int num2=200;
		int result = num1+num2;
		System.out.println("result=>"+result);
		result=500;
		System.out.println("result=>"+result);
		//result="재할당";
		System.out.println("result=>"+result);
	}

}
