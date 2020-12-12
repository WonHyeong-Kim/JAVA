package chap05.obj;

public class TypeTest {
	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		System.out.println("*********기본형 데이터의 비교***********");
		if(i==j) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		System.out.println("*********참조형 데이터의 비교***********");
		String str = new String("java");
		String str2 = new String("java");
		//str=str2;
		if(str==str2) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		System.out.println("*********문자열 데이터의 비교***********");
		if(str.equals(str2)) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
	}
}










