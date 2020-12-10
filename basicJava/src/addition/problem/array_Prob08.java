package addition.problem;

public class array_Prob08 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int count=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=arr[i].length-1;j>=0;j--) {
				arr[i][j]=count;
				count++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
