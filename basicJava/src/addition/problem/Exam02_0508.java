package addition.problem;
public class Exam02_0508 {
	public static void main(String[] args) {


		char[][] alphabet = new char[5][5];
		char start='A';
		int count=0;
		
		
		//1.배열에 알파벳 입력
		for(int i=0;i<alphabet.length;i++) {
			for(int j=0;j<alphabet[0].length;j++) {
				alphabet[i][j]=(char)(start+count);
				count++;
			}
		}
		//2.원본 배열 출력
		System.out.println("                원본배열\n"
				+ "==================================");
		for(int i=0;i<alphabet.length;i++) {
			for(int j=0;j<alphabet[0].length;j++) {
				System.out.print(alphabet[i][j]+"\t");
			}
			System.out.println();
		}
		//3. 배열 수정
		System.out.println("                 수정된 배열\n"				+ "==================================");
		for(int i=0;i<alphabet.length;i++) {
			for(int j=0;j<alphabet[0].length;j++) {
				if(i==j) {
					alphabet[i][j]='*';
				}
			}
		}
		//4. 수정된 배열 출력
		for(int i=0;i<alphabet.length;i++) {
			for(int j=0;j<alphabet[0].length;j++) {
				System.out.print(alphabet[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
