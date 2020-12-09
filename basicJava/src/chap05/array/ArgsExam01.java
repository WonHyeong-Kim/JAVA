package chap05.array;

public class ArgsExam01 {

	public static void main(String[] args) {
		int sum=0;
		int avg=0;
		for(int i=0; i<args.length;i++) {
			sum+=Integer.parseInt(args[i]);
		}
		System.out.println("합: "+sum);
		System.out.println("평균: "+sum/args.length);

	}

}
