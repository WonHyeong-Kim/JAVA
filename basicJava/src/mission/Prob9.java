package mission;

import java.util.Scanner;

public class Prob9 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요.:");
		Scanner key = new Scanner(System.in);
		String result="";
		int num = key.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=0;j<num-i;j++) {
				result += "*";
			}
			result+="\n";
		}
		System.out.println(result);
		key.close();
	}
}
