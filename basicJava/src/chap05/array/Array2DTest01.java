package chap05.array;

public class Array2DTest01 {

	public static void main(String[] args) {
		int[][] myarr = new int[3][2];
		myarr[0][0]=100;
		myarr[1][0]=200;
		myarr[2][0]=300;
		/*System.out.println(myarr[0][0]);
		System.out.println(myarr[0][1]);*/
		for(int outer=0; outer<3;outer++) {
			for(int inner=0; inner<2;inner++) {
				System.out.print(myarr[outer][inner]+" ");
			}
			System.out.println();
		}
		System.out.println("myarr를 통해 액세스를 배열의 길이"+myarr.length);

	}

}
