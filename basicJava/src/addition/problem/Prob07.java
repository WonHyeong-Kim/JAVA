package addition.problem;

public class Prob07 {

	public static void main(String[] args) {
		int n=15;
		int result=0;
		int difference=0;
		int oldNumber=1;
		int currentNumber=0;
		
		for(int i=0;i<n;i++) {
			currentNumber=(oldNumber+difference);
			result+=currentNumber;
			oldNumber=currentNumber;
			difference++;
		}
		System.out.println(n+"번째까지의 합 : "+result);
	}

}
