package chap05.array;

import java.util.Random;

public class ArrayExam02 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Random rand =new Random();
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = rand.nextInt(10); // 0~9
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print((arr[i]+1)+" ");
		}
		

	}

}
