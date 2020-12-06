package mission;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		System.out.print("암호화할 문자열:");
		Scanner key = new Scanner(System.in);
		String str1 = key.nextLine();
		String str2="";
		
		//System.out.println('x'-'a');
		for(int i=0; i<str1.length(); i++) {
			char c = str1.charAt(i);
			if(c ==' ') {
				str2+=' ';
				continue;
			}
			if(c=='x'|c=='y'|c=='z'|
					c=='X'|c=='Y'|c=='Z') {
				c-=23;
			}
			else {
				c+=3;
			}
			str2+=c;
		}
		System.out.printf(str2);
		key.close();
	}
}
