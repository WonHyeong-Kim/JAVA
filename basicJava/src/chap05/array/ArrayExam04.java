package chap05.array;

public class ArrayExam04 {

	public static void main(String[] args) {
		int[] answer = {1,4,4,5,1,4,4,2,1,3,2};
		int[] counter = new int[4];
		//answer에 저장된 숫자의 중복 개수를 counter의 요소에 저장하기
		// counter에 저장된 1부터 4까지 숫자 개수 만큼 * 출력하기(이중 for문)
		for(int i=0; i<answer.length;i++) {
			if(answer[i] == 1) {
				counter[0]++;
			}
			else if(answer[i] == 2) {
				counter[1]++;
			}
			else if(answer[i] == 3) {
				counter[2]++;
			}
			else if(answer[i] == 4) {
				counter[3]++;
			}
		}
		
		for(int i=0; i<counter.length;i++) {
			for(int j=0;j<counter[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
