package addition.problem;
public class Prob16_ans {
	public static void main(String[] args) {
		int year = 2010;
		int month = 2;
		int maxDay;

		/* 이 부분을 작성하세요 */
		
		//==> default maxDay assignment
		maxDay = 28;
		
		if ((year % 4 == 0)) {
			//==> 4의 배수는 윤년
			maxDay = 29;
			
			if (year % 100 == 0 ) {
				//==> 100의 배수인 해는 윤년아님
				maxDay = 28;
				
				if ( year % 400 == 0){
					//==> 400의 배수인 해는 윤년
					maxDay = 29;
				}
			} 
		}//end of if
		System.out.println(year + "년 " + month + "월의 말일은 " + maxDay + "일 입니다");
		
		if ((year % 4 == 0)) {
			//==> 4의 배수는 윤년
			maxDay = 29;
			
			if (year % 100 == 0  &&  year % 400 != 0) {
				//==> 100의 배수이고 400의 배수가 아니면 윤년아님
				maxDay = 28;
			} 
		}//end of if
		System.out.println(year + "년 " + month + "월의 말일은 " + maxDay + "일 입니다");
	}
}//end of class