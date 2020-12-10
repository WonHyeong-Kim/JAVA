package addition.problem;
public class array_Prob05 { 
	public static int getValue(int[] values, boolean isMax) { 
		// int 타입 배열의 최대값 또는 최소값을 리턴한다.
		if(isMax == true) {
			int max_value=Integer.MIN_VALUE;
			
			for(int i=0; i<values.length;i++) {
				if(max_value <values[i]) {
					max_value=values[i];
				}
			}
			return max_value;
		}
		else {
			int min_value=Integer.MAX_VALUE;
			for(int i=0; i<values.length;i++) {
				if(min_value >values[i]) {
					min_value=values[i];
				}
			}
			return min_value;
		}
	} 
	
	public static void main(String[] args) { 
		int[] values = {57, 3, 43, 5, 39, 23, 55, 2};
		
		int maxValue = getValue(values, true);
		int minValue = getValue(values, false); 
		
		System.out.println("최대값 = " + maxValue);
		System.out.println("최소값 = " + minValue); 
	} 
}

