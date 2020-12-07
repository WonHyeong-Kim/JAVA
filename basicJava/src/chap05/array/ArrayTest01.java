package chap05.array;

public class ArrayTest01 {
	public static void main(String[] args) {
		/*int[] myarr;
		myarr = new int[3];*/
		int[] myarr = new int[3];
		System.out.println("배열을 참조하는 변수=>"+myarr);
		
		System.out.println(myarr[0]);
		System.out.println(myarr[1]);
		System.out.println(myarr[2]);
		
		myarr[0]=100;
		
		System.out.println(myarr[0]);
		System.out.println(myarr[1]);
		System.out.println(myarr[2]);
		
		short[] sarr = new short[2];
		boolean[] barr = new boolean[2];
		double[] darr = new double[2];
		
		System.out.println("배열번지"+sarr+" 0번째 요소 값"+sarr[0] );
		System.out.println("배열번지"+barr+" 0번째 요소 값"+barr[0] );
		System.out.println("배열번지"+darr+" 0번째 요소 값"+darr[0] );
	}
}
