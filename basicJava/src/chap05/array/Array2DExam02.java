package chap05.array;

public class Array2DExam02 {

	public static void main(String[] args) {
		String[] strArr = new String[] {"장동건","이민호","임창정","홍길동","장민호"};
		int[][] scoreArr = new int[][] {{99,100,89},
										{100,98,100},
										{99,88,100},
										{100,99,87},
										{100,100,100}};
		//int[] sum = new int[5];
		int[] sum = new int[strArr.length];
		
		String[] col=new String[] {"이름","오라클","자바","웹","총점","평균"};
		for(int i=0;i<col.length;i++) {
			System.out.print(col[i]+"\t");
		}
		System.out.println();
		for(int i=0; i<scoreArr.length;i++) {
			System.out.print(strArr[i]+"\t");
			for(int j=0; j<scoreArr[i].length;j++) {
				System.out.print(scoreArr[i][j]+"\t");
				sum[i]+=scoreArr[i][j];
			}
			System.out.print(sum[i]+"\t");
			System.out.print(sum[i]/scoreArr[i].length+"\t");
			System.out.println();
		}
	}
}
