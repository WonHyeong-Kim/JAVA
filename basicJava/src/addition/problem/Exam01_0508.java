package addition.problem;
public class  Exam01_0508{
	public static void main(String[] args) 	{
		int[] num = new int[]{10, 30, 20, 80, 50} ;
		int sum=0;
		double rate=0;
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
		}
		System.out.println(sum);
		for(int i=0;i<num.length;i++) {
			rate = ((double)num[i]/(double)sum*100.0);
			for(int j=0;j<(int)rate;j++) {
				System.out.print("*");
			}
			System.out.println("("+rate+")");
		}
	}
}
