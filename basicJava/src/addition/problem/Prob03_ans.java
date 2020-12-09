package addition.problem;
import java.util.Scanner;

public class Prob03_ans {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");
		
		int inputInt = 1;
		try {
			inputInt = keyboard.nextInt();
		} catch (Exception e) {
			System.err.print("입력하신 값은 Integer Type이 아닙니다.");
			return;
		}
		
		if (inputInt < 2 || inputInt > 9) {
			System.err.print("잘못된 숫자가 입력되었습니다.");
			return;
		}
		
		int result =1;
		for(int i=1;i<=inputInt;i++){
			result =1;
			for(int j=2;j<=i;j++){
				result*=j;
			}
			System.out.println(i+"!="+result);
			
		}
	}
}

