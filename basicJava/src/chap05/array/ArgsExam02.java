package chap05.array;

public class ArgsExam02 {

	public static void main(String[] args) {
		String temp=args[0];
		String result="";
		int len = temp.length();
		for(int i=0;i<len;i++) {
			result+=temp.charAt(len-i-1);
		}
		for(int i=len-1;i>0;i--) {
			result+=temp.charAt(i);
		}
		System.out.println(result);

	}

}
