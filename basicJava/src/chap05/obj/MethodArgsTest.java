package chap05.obj;

//메소드의 매개변수로 값을 넘기는 경우
//메소드의 매개변수로 배열이나 객체를 넘기는 경우
public class MethodArgsTest {
	public static void main(String[] args) {
		int i = 100;
		int[] mainArr = new int[] {10,20,30,40,50};
		System.out.println("***********값변경전***********");
		display(i, mainArr);
		change(i, mainArr);
		System.out.println("***********값변경후***********");
		display(i, mainArr);
	}
	//매개변수의 값을 출력하는 메소드
	public static void display(int i,int[] myarr) {
		System.out.println("i의 값=>"+i);
		for (int j = 0; j < myarr.length; j++) {
			System.out.print("myarr의 값=>");
			System.out.print(myarr[j]+"\t");
		}
		System.out.println();
	}
	//매개변수의 값을 변경하는 메소드
	public static void change(int i,int[] myarr) {
		i = 200;
		myarr[2] = 300;
	}
}
