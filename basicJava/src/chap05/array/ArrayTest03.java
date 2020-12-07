package chap05.array;

public class ArrayTest03 {

	public static void main(String[] args) {
		String[] strArr = new String[5];
		strArr[0] = new String("java");
		
		System.out.println("배열 요소의 개수 : "+strArr.length);
		System.out.println("배열 마지막 요소 : "+strArr[strArr.length-1]);
	}

}
