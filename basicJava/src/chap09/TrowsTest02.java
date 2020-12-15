package chap09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TrowsTest02 {
	public void test() throws ArithmeticException{
		System.out.println(10/0);
	}
	public void test2() throws ArithmeticException, FileNotFoundException{
		test();
		FileInputStream fis = new FileInputStream("test.txt");
	}
	public void test3() throws UnknownHostException, IOException, ArithmeticException, FileNotFoundException{
		test2();
		Socket socket = new Socket("127.0.0.1",12345);
	}
	/* UnknownHostException, FileNotFoundException은 IOException의 하위이므로 IOException만 처리해도 모두 적용할 수 있다.
	 * (객체의 다형성)
	 * RuntimeException의 하위 Exception은 throws하지않아도 문법적으로 문제사항이 아니다.
	 * 그러나 명시적으로 모두 처리한다.
	 */	
	public void test4() throws IOException{
		test2();
		Socket socket = new Socket("127.0.0.1",12345);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
