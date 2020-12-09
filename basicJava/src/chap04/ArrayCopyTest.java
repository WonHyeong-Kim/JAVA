package chap04;

public class ArrayCopyTest {

	public static void main(String[] args) {
		// 배열은 한번 만들어진 요소의 사이즈를 조절할 수 없다.
		int[] arrSrc = {10,20,30,40,50};
		int[] arrDest = new int[10];
		System.out.println("복사전");
		for(int i=0;i<arrDest.length;i++) {
			System.out.print(arrDest[i]+"\t");
		}
		// 배열복사
		//System.arraycopy(복사하려는 원본배열, 원복배열의 복사할 시작시점(index), 복사배열을 붙여넣기 할 target 배열,붙여넣기할 target 시작위치, 복사될 요소개수);
		System.arraycopy(arrSrc,0,arrDest,2,3);
		System.out.println("복사후");
		for(int i=0;i<arrDest.length;i++) {
			System.out.print(arrDest[i]+"\t");
		}
	}

}
