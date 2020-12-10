package addition.problem;
public class SortUtil {
	public static void main(String[] args){
		SortUtil s = new SortUtil();
		 int[] inputNumbers = {7, 5, 2, 19, 34, 51, 32, 11, 67, 21};
		 int[] arr =s.ascending(inputNumbers);
		 for(int i=0; i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
	}
	public int[] ascending(int[] inputNumbers) {
    // implements ascending method.
		int temp=0;
		for(int i=0; i<inputNumbers.length;i++) {
			for(int j=0; j<inputNumbers.length;j++) {
				if(inputNumbers[i] < inputNumbers[j] & i!=j) {
					 temp = inputNumbers[j];
					 inputNumbers[j] = inputNumbers[i];
					 inputNumbers[i]=temp;
				}
				
			}
		}
		return inputNumbers;
	}
}
