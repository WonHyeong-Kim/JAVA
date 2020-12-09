package addition.problem;

public class Prob02 {
	public static void main(String[] args) {
		boolean prime = false;
		for(int i=2; i<51; i++) {
			prime = true;
			for(int j=2; j<i; j++) {
				if( i%j == 0) {
					prime = false; // 하나라도 나눠서 0이 되면 false;
					break;
				}
			}
			if(prime == true) {
				System.out.println(i);
			}
		}
	}
}
