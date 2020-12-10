package addition.problem;
public class array_Prob03 {
	public static void main(String[] args) {
		int[] array = {3, 17, 12, 43, 3, 17, 3, 8, 21, 8};
		System.out.println("<< 중복되지 않은 숫자 >>");
		printUniqueNumber(array);
	}

	private static void printUniqueNumber(int[] array) {
		// 구현하세요.
		boolean overlap=false;
		for(int i=0;i<array.length;i++) {
			overlap=false;
			for(int j=0; j<array.length;j++)
			if(array[i] ==array[j] & i!=j) {
				overlap=true;
			}
			if(overlap == false) {
				System.out.print(array[i]+", ");
			}
		}
	}
}
