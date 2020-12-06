package mission;

import java.util.Scanner;

public class Prob5 {
	static int gcd(int a, int b) {
		int betterMin=0;
		
		betterMin = (a>b)? b : a;
		for(int i = betterMin; i>0; i--) {
			if(a%i == 0 & b%i == 0) {
				return i;
			}
		}
		
		
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int a=key.nextInt();
		int b=key.nextInt();
		
		int result = gcd(a,b);
		
		System.out.println(result);
		
		key.close();
	}

}
