package addition.problem;

public class Prob11_ans {
	public static void main(String[] args) {
		int num1 = 6, num2 = 15;
		System.out.println("두 수의 차는 : " + abs(num1, num2));
	}

	private static int abs(int num1, int num2) {
		int result = 0;
		result = num1 - num2;
		if(result  < 0){
			return result * -1;
		}
		return result;
	}
}
