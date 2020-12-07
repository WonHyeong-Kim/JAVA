package chap04;

public class WhileExam {

	public static void main(String[] args) {
		int i=0;
		int allSum=0;
		int evenSum=0;
		int oddSum=0;
		while(true) {
			i++;
			allSum+=i;
			if(i%2==0) {
				evenSum+=i;
			}
			else {
				oddSum+=i;
			}
			if(i>=100) {
				break;
			}
		}
		System.out.println("전체합"+allSum);
		System.out.println("짝수합"+evenSum);
		System.out.println("홀수합"+oddSum);

	}

}
