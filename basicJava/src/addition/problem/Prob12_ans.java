package addition.problem;

public class Prob12_ans {
	public static void main(String args[]) {
		int[] array = { 3, 24, 1, 55, 17, 43, 5 };
		for (int i = 0; i < array.length - 1; i++) {
			for (int k = 0; k < array.length - 1; k++) {
				int temp = array[k];
				int temp_ = array[k + 1];
				if (array[k] > array[k + 1]) {
					array[k] = temp_;
					array[k + 1] = temp;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}
}
