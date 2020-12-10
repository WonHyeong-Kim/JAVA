package addition.problem;
public class ArrayUtil {
	public static void main(String[] args){
		ArrayUtil a = new ArrayUtil();
		char[] s = {'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm'};
		char[] out = new char[11];
		out=a.reverseString(s,0,3);
		a.printString(out);
		
		out=a.reverseString(s,4,7);
		a.printString(out);
		
		out=a.reverseString(s,8,10);
		a.printString(out);
		
		out=a.reverseString(s,0,10);
		a.printString(out);
		
	}
	public char[] reverseString(char[] s, int start, int end) {
		
		int len = end-start+1;
		char temp=' ';
		//reverseString 메소드 구현
		for(int i=0; i<len/2;i++) {
			temp=s[start+i];
			s[start+i]=s[end-i];
			s[end-i]=temp;
		}
		
		
		return s;
	}
	public void printString(char[] s) {
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]);
		}
		System.out.println();
	}
}
