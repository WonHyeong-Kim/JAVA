package chap04;

public class HapTest {

	public static void main(String[] args) {
		int allSum=0;
		int oddSum=0;
		int evenSum=0;
		for(int i=1; i<101; i++)
		{
			allSum+=i;
			if(i%2 == 0) {//짝수
				evenSum+=i;
			}
			else {
				oddSum+=i;
			}
		}
		System.out.println("전체합: "+allSum);
		System.out.println("짝수합: "+evenSum);
		System.out.println("홀수합: "+oddSum);

	}

}
