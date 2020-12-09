package addition.problem;
public class CycleGame {

	/*  이곳에 cycleCount 메소드를 작성하십시오. */
	public int cycleCount(int val){
		int count = 0;	//횟수
		while (val != 1) {			//val==1일때 까지 반복
			switch(val%2){
			case 0:					//짝수
				val = val / 2;
				break;
			case 1:					//홀수
				val = val * 3 + 1;
				break;
			}//switch
			count++;
		}//while
		return count;
	}//cycleCount
	
		
	public static void main(String[] args) {
		CycleGame cg = new CycleGame();
		
		System.out.println(20 + "은 " + cg.cycleCount(20) + "번 반복합니다.");
		System.out.println(30 + "은 " + cg.cycleCount(30) + "번 반복합니다.");
		System.out.println(40 + "은 " + cg.cycleCount(40) + "번 반복합니다.");
	}

}
