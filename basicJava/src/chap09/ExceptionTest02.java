package chap09;

public class ExceptionTest02 {

	public static void main(String[] args) {
		try {
			//예외발생 가능성이 있는 코드
			System.out.println("try start");;
			System.out.println(args[0]);
			System.out.println("try end");;
		}
		catch(Exception e) {
			System.out.println("예외발생");
			System.out.println("예외처리");
		}

	}

}
