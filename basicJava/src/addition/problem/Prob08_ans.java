package addition.problem;
public class Prob08_ans {

	public static void main(String args[]) {
	    
		Prob08 prob8 = new Prob08();
		
		System.out.println( prob8.leftPad("SDS", 6, '#') );
		System.out.println( prob8.leftPad("SDS", 5, '$') ); 
		System.out.println( prob8.leftPad("SDS", 2, '&') ); 
		 
	}
	
	public String leftPad(String str, int size, char padChar) {
		
		/*  여기에 프로그램을 완성하십시오. */
		int length = str.length();
		
		if(length >= size ) {
			return str;
		}
		
		String result = "";
		for(int i=0; i<size-length; i++) {
			result += padChar;
		}
		result += str;
		
		return result;
	}
	
}
