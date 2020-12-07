package chap05.array;

public class Prob0 {

	public static void main(String[] args) {
		int sum = 0;
		int even = 0;
		int odd = 0;
		for(int i=1; i<=1000;i++) {
			sum+=i;
			if(i%2==0) {
				even+=i;
			}
			else {
				odd+=i;
			}
		}
		System.out.println("1부터 1000까지의 총합 "+sum);
		System.out.println("1부터 1000까지 홀수의 합 "+odd);
		System.out.println("1부터 1000까지 짝수의 합 "+even);

	}

}
