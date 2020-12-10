package chap05.obj;


public class Prob1 {

	public static void main(String[] args) {
		MyMethodUtil m = new MyMethodUtil();
		
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};
		
		System.out.println("( 배열 ia )");
		m.printHap(ia);
		System.out.println("( 배열 ib )");
		m.printHap(ib);	
	}
	
	
}
