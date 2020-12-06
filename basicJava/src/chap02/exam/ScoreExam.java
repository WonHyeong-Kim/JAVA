package chap02.exam;

public class ScoreExam {
	public static void main(String[] args) {
		int kor = 70;
		int eng = 80;
		int math = 90;
		int totalScore, avrScore=0;
		totalScore = kor+eng+math;
		avrScore = totalScore/3;
		System.out.println("전체 총합계 =>"+totalScore);
		System.out.println("평균 =>"+avrScore);
	}
}
