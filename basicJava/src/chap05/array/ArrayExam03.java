package chap05.array;

public class ArrayExam03 {

	public static void main(String[] args) {
		int[] myarr = {98,88,78,100,100,98,56};
		int sum=0;
		int avg=0;
		for(int i=0; i<myarr.length; i++) {
			sum+=myarr[i];
		}
		avg=sum/myarr.length;
		System.out.println("총합:"+sum);
		System.out.println("평균:"+avg);

	}

}
