package chap04;

public class Prob1 {

	public static void main(String[] args) {
		boolean prime = true;
		int count=0;
		for(int i=2;i<101;i++) {
			prime = true;
			for(int j=2; j<i;j++) {
				if(i%j == 0) {
					prime=false;
					break;
				}
			}
			if(prime==true) {
				System.out.println(i+"=> 소수입니다.");
				count++;
			}
		}
		System.out.println("소수의 개수=>"+count);
		
		System.out.println("===========answer=========");
		int num=0;
		int cnt=0;
		for(int n=1; n<=100;n++) {
			for(int p=1;p<=n;p++) {
				if(n%p == 0) {
					cnt++;
				}
			}
			if(cnt==2) {
				System.out.println(n+"=> 소수입니다.");
				num++;
			}
			cnt=0;
				
		}
		System.out.println("소수의 개수=>"+num);
	}

}
