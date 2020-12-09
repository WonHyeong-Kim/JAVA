package addition.problem;

import java.util.Scanner;

public class Prob12 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("배열수를 입력:");
		int len = key.nextInt();
		System.out.print("배열을 입력:");
		int array[] = new int[len];
		for(int i=0;i<len;i++) {
			array[i] = key.nextInt();
		}
		
		for(int i=0; i<len; i++) {
			for(int j=0; j<len; j++) {
				if(array[i] < array[j])
				{
					int temp=0;
					temp = array[i];
					array[i] = array[j];
					array[j]=temp;
				}
			}
		}
		
		for(int i=0; i<len;i++) {
			System.out.print(array[i]+" ");
		}
		key.close();
	}

}
