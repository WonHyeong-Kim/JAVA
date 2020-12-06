package chap03;

public class OprTest04_Short {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		
		
		System.out.println((num1<num2)&&(num1>=100));
		System.out.println((num1<num2)||(num1>100));
		
		String str =null;
		int num = 100;
		
		//str.length();
		// 실행오류 -컴파일은 문제가 없으나 실행 중에 오류가 발생하는 경우
		
		// || 연산자는 왼쪽 할을 검사해서 true이면 || 연산의 특성에 따라 오른쪽 항은 검사하지않는다.
		System.out.println(num>=100 || str.length() == 0);
		System.out.println(num>=100 | str.length() == 0);
		
		// && 연산자는 왼쪽 할을 검사해서 false이면 || 연산의 특성에 따라 오른쪽 항은 검사하지않는다.
		System.out.println(num>100 && str.length() == 0);
		
		
	}

}
