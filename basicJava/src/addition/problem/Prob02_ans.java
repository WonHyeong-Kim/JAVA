package addition.problem;
public class Prob02_ans {

	public static void main(String[] args) {
		int i, j;
        int count = 0;
		int num= 0 ;
        for (i = 1; i <= 100; i++) {
			count=0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0){
                    count++;
				}

            }
            if (count == 2){
                System.out.println(i);
				num++;
			}
        }
		 System.out.println(num);
	}

}
