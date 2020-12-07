package chap05.array;

public class ArrayExam01 {

	public static void main(String[] args) {
		int[] myarr=new int[3];
		myarr[0]=100;
		myarr[1]=200;
		myarr[2]=300;
		
		for(int i=0; i<myarr.length;i++) {
			System.out.println("myarr["+i+"] => "+myarr[i]);	
		}
		

	}

}
