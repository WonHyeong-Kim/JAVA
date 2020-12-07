package chap04;

public class GuGu_Break {

	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			/*if(i==5) {
				break;
			}*/
			for(int j=1;j<10;j++) {
				/*if(i==5) {
					break;
				}*/
				if(j==5) {
				break;
				}
				System.out.print(j+" * "+i+" = "+(i*j)+"\t");
			}
			System.out.println();
		}

	}

}
