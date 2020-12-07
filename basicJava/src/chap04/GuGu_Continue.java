package chap04;

public class GuGu_Continue {

	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			/*if(i==5) {
				continue;
			}*/
			for(int j=2;j<10;j++) {
				/*if(i==5) {
					continue;
				}*/
				if(j==5) {
					continue;
				}
				System.out.print(j+" * "+i+" = "+(i*j)+"\t");
			}
			System.out.println();
		}

	}

}
