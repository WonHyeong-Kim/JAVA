package addition.problem;

import java.util.Random;

public class array_Prob02 {

	public static void main(String[] args) {
		System.out.println("<<생성된 난수>>");
		array_Prob02 p = new array_Prob02();
		
		int[] arr = p.generateRandom();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		System.out.println("배열에서 가장 큰숫자 : "+p.getMaxNum(arr));
	}
	public int[] generateRandom() {
		int array[] = new int[10];
		Random rand = new Random();
		for(int i=0; i<10; i++) {
			array[i] = rand.nextInt(30)+1;//0~29
		}
		return array;
	}
	public int getMaxNum(int[] arr) {
		int maxNum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length; i++) {
			if(arr[i]>maxNum) {
				maxNum = arr[i];
			}
		}
		return maxNum;
	}

}
