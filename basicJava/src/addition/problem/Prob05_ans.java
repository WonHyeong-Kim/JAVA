package addition.problem;
public class Prob05_ans {
	public static void main(String args[]) {
		Prob05 p5=new Prob05();
		System.out.println(p5.gcd(2,5));
		System.out.println(p5.gcd(5,15));
		System.out.println(p5.gcd(250,30));
	}
	public int gcd(int num1,int num2) {
		while(num1!=0) {
			if(num2>num1) {
				int temp=num2;
				num2=num1;
				num1=temp;
			}
			num1=num1-num2;

		}
		return num2;
	}

	public int gcd2(int num1,int num2) {
		int min=num2;
		int maxNum=1;
		if(num1<num2) {
			min=num1;
		}
		for(int loop=1;loop<=min;loop++) {
			if(num1%loop==0 && num2%loop==0) {
				maxNum=loop;	
			}
		}
		return maxNum;
	}
}