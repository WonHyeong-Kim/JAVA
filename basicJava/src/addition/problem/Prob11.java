package addition.problem;

import java.util.Scanner;

public class Prob11 {
	static int abs(int a, int b) {
		int result=0;
		result=a-b;
		if(result<0) {
			result= result *(-1);
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int a = key.nextInt();
		int b = key.nextInt();
		int result = abs(a,b);
		
		System.out.println(result);
		key.close();

	}

}
