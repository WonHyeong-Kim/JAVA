package chap05.array;

import java.util.Random;

public class Array2DExam03 {

	public static void main(String[] args) {
		int[] num = new int[5];
		Random rand = new Random();
		boolean overlap=false;
		for(int i=0; i<num.length;i++) {
			while(true){
				overlap=false;
				num[i] = rand.nextInt(45)+1;//0~44
				for(int j=0;j<num.length;j++) {
					if(num[j] == num[i] & i!=j)
					overlap=true;
				}
				if(overlap==false) {
					break;
				}
			}
			System.out.println((i+1)+"번째 숫자 : " + num[i]);
		}

	}

}
