package chap05.array;
public class Prob1_arry {
	public static void main(String[] args) {

		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};
		int ia_even=0;
		int ia_odd=0;
		for(int i=0; i<ia.length;i++) {
			if(ia[i]%2 ==0) {
				ia_even+=ia[i];
			}
			else {
				ia_odd+=ia[i];
			}
		}
		System.out.println("배열 ia");
		System.out.println("홀수의 합:"+ia_even);
		System.out.println("짝수의 합:"+ia_odd);
		int ib_even=0;
		int ib_odd=0;
		for(int i=0; i<ib.length;i++) {
			if(ib[i]%2 ==0) {
				ib_even+=ib[i];
			}
			else {
				ib_odd+=ib[i];
			}
		}
		System.out.println("배열 ib");
		System.out.println("홀수의 합:"+ib_even);
		System.out.println("짝수의 합:"+ib_odd);
	}

}
