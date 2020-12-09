package addition.problem;
public class Prob04_ans {

	public static void main(String[] args) {
		String sourceString = "java programming";
		String encodedString = "";
			
		// 프로그램을 구현부 시작.	
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다. 
		for(int i=0; i<sourceString.length(); i++) {
			char currentChar = sourceString.charAt(i); 
			if(currentChar == ' ')
				encodedString += ' ';
			else if (currentChar == 'x' || currentChar == 'y' || currentChar == 'z')
				encodedString += (char)(currentChar-23);
			else
				encodedString += (char)(currentChar+2);
		}
		// 프로그램 구현부 끝.
		
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
		
	}

}

