package chap05.array;

public class ArrayTest05 {

	public static void main(String[] args) {
		int[] myarr = {10,20,30,40,50, 60};
		System.out.println("배열의길이"+myarr.length);
		for(int i=0; i<myarr.length;i++) {
			System.out.println(myarr[i]);
		}
		
		int[] myarr2 = new int[]{10,20,30,40,50, 60};
		
		System.out.println("배열의길이"+myarr2.length);
		for(int i=0; i<myarr2.length;i++) {
			System.out.println(myarr2[i]);
		}
		//String 타입의 배열 - String 데이터를 표현한 리터럴이 ""(참조형 중 유일하게 리터럴로 표현이 가능)
		String str = new String("java");
		String str2 ="java";
		String[] myarr3 = {"java", "oracle","html"};
		System.out.println(myarr3.length);
		for(int i=0; i<myarr3.length; i++) {
			System.out.println(myarr3[i]);
		}
		
		String myVal = new String("javascript");
		String[] myarr4 = {new String("java"),
				new String("oracle"),
				new String("html"),
				myVal};
	}

}
