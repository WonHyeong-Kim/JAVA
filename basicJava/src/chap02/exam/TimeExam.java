package chap02.exam;

public class TimeExam {
	public static void main(String[] args) {
		int time = 8888;
		int hour=0;
		int minute=0;
		int second=0;
		minute=time/60;
		second=time%60;
		hour = minute/60;
		minute%=60;
		
		System.out.println(hour+"시간"+minute+"분"+second+"초");
	}
}
