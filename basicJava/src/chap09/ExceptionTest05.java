package chap09;
// try catch finally
// 오류가 발생거나 발생하지않거나 반드시 실행해야하는 명령문은 finally 블럭안에 정의한다.
public class ExceptionTest05 {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println("start");
			str.length();
			System.out.println("end");
			System.out.println("반드시 실행되어야하는 문장 - 메모리해제");
			
		}catch(NullPointerException e){
			System.out.println("오류발생");
		}catch(Exception e){
			System.out.println("그외 오류발생");
		}finally {
			System.out.println("반드시 실행되어야하는 문장 - 메모리해제");
		}
		System.out.println("반드시 실행되어야하는 문장 - 메모리해제");
		

	}

}
