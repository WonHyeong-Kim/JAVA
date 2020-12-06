package mission;

import java.util.Scanner;

public class Prob8 {
	public static String leftPad(String str, int size, char padChar) {
		String result="";
		int len = str.length();
		if(len >= size) {
			return str;
		}
		for(int i=0; i<size-len;i++) {
			result += padChar;
		}
		result+=str;
		
		return result;
	}
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String str = key.next();
		int size = key.nextInt();
		char padChar = key.next().charAt(0);
		/*String temp = key.next();
		char padChar=temp.charAt(0);*/
		String result = leftPad(str, size, padChar);
		
		System.out.println(result);
		
		key.close();
	}
}
