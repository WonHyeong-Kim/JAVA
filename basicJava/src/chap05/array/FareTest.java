package chap05.array;
import java.util.Scanner;
public class FareTest {
	public static void main(String[] args) {
		System.out.println("---Menu--------------\n"
				+ "1. 가정용(liter당 50원)\n"
				+ "2. 상업용(liter당 45원)\n"
				+ "3. 공업용(liter당 30원)\n"
				+ "---------------------\n"
				+ "메뉴를 선택하세요=>\n"
				+ "---------------------");
		Scanner key =new Scanner(System.in);
		int code = key.nextInt();
		System.out.println("사용량을 입력하세요=>");
		int usage = key.nextInt();
		int usageFee = 0;
		double totalFee=0;
		switch (code) {
		case 1:
			usageFee = usage*50;
			totalFee=(double)(usageFee*1.05);
			System.out.println("사용자코드: " + code);
			System.out.println("사용자요금: " + usageFee);
			System.out.println("총수도 요금: " + totalFee);
			break;
		case 2:
			usageFee = usage*45;
			totalFee=(double)(usageFee*1.05);
			System.out.println("사용자코드: " + code);
			System.out.println("사용자요금: " + usageFee);
			System.out.println("총수도 요금: " + totalFee);
			break;
		case 3:
			usageFee = usage*30;
			totalFee=(double)(usageFee*1.05);
			System.out.println("사용자코드: " + code);
			System.out.println("사용자요금: " + usageFee);
			System.out.println("총수도 요금: " + totalFee);
			break;
		default:
			break;
		}
		key.close();
	}

}
