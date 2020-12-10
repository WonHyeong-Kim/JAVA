package chap05.obj;

public class MyMethodUtil {
	public void ssnCheck (int ssn) {
		if(ssn == 1 | ssn ==3) {
			System.out.println("남자");
		}
		else if(ssn == 2 | ssn ==4) {
			System.out.println("남자");
		}else {
			System.out.println("기타");
		}
	}
	public double calc(double num1, double num2, int opr) {
		double result=0.0;
		switch (opr) {
		case 1:
			result = num1+num2;
			break;
		case 2:
			result = num1*num2;
			break;
		case 3:
			result = num1-num2;
			break;
		case 4:
			result = num1/num2;
			break;
		default:
			break;
		}
		
			return result;
		
	}
	
	public void checkVal(int age, int gender) {
		String result="";
		
		if(gender == 1) {
			result+="남자";
		}
		else if(gender == 2) {
			result+="여자";
		}
		System.out.println(ageCheck(age)+result);
	}
	public String ageCheck(int age) {
		String result="";
		if(age >= 20) {
			result+="성인";
		}
		else {
			result+="청소년";
		}
		return result;
	}
	public void printHap(int[] arr) {
		int sum1 = 0;//홀수합
		int sum2 = 0;//짝수합 
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				sum2 = sum2 + arr[i];
			}else{
				sum1 = sum1 + arr[i];
			}
		}
		System.out.println("홀수의 합 :"+sum1);
		System.out.println("짝수의 합 :"+sum2);	
	}
}


















