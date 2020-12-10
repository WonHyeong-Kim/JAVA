package addition.problem;

import java.util.Arrays;

public class array_Prob06 {

	public static void main(String[] args) {
		array_Prob06 median = new array_Prob06();

		int[] values1 = { 10, 4, 53, 63, 17, 37, 52, 16, 33, 65 };
		System.out.println("input : "+Arrays.toString(values1));
		System.out.println("median : "+median.findMedian(values1));
		System.out.println("=================================================");
		
		int[] values2 = { 32, 53, 52, 76, 15, 98, 76, 65, 36, 10 };
		System.out.println("input : "+Arrays.toString(values2));
		System.out.println("median : "+median.findMedian(values2));
	}

	public int findMedian(int[] values) {
		double avg=0;
		
		int len = values.length;
		for(int i=0; i<len;i++) {
			avg+=values[i];
		}
		avg/=len;
		int min_value=Integer.MAX_VALUE;
		int min_index=0;
		for(int i=0; i<len;i++) {
			if( min_value >= Math.abs(avg-values[i])){
				min_value=(int) Math.abs(avg-(double)(values[i]));
				min_index=i;
			}
		}		
		return values[min_index];
	}
}
