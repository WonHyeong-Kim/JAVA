package chap05.array;

public class ArrayTest04 {
	public static void main(String[] args) {
		String[] myarr = new String[5];
		myarr[0] = new String("java");
		myarr[3] = new String("javascipt");
		
		System.out.println(myarr[0]);
		System.out.println(myarr[0].toString());
		System.out.println(myarr[1]);
		//System.out.println(myarr[1].toString());
		System.out.println(myarr[2]);
		//System.out.println(myarr[2].toString());
		System.out.println(myarr[3]);
		System.out.println(myarr[3].toString());
		System.out.println(myarr[4]);
		//System.out.println(myarr[4].toString());
		System.out.println("**********");
		for(int i=0; i<myarr.length;i++) {
			System.out.println(myarr[i]);
		}
	}
}
