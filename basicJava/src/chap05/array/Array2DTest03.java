package chap05.array;

public class Array2DTest03 {

	public static void main(String[] args) {
		char[][] myarr = new char[5][];
		myarr[0] = new char[1];
		myarr[1] = new char[2];
		myarr[2] = new char[3];
		myarr[3] = new char[4];
		myarr[4] = new char[5];
		
		System.out.println(myarr[0].length);
		System.out.println(myarr[1].length);
		System.out.println(myarr[2].length);
		System.out.println(myarr[3].length);
		System.out.println(myarr[4].length);
		
		for(int i=0; i<myarr.length;i++) {
			for(int j=0; j<myarr[i].length;j++) {
				myarr[i][j]='*';
			}
		}
		
		for(int i=0; i<myarr.length;i++) {
			for(int j=0; j<myarr[i].length;j++) {
				System.out.print(myarr[i][j]);
			}
			System.out.println();
		}
		
	}

}
