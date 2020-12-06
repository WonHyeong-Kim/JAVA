package chap02;

public class PrimitiveTypeTest {
	public static void main(String[] args) {
		boolean bool =true;
		System.out.println(bool);
		
		char c = 'a'; // ''는 char타입이고 "" 문자열
		System.out.println(c);
		
		byte b =127; // 데이터 타입 범위 이상의 값은 할당할 수 없다.
		System.out.println(b);
		
		short s = 32767;
		System.out.println(s);
		
		int i = 2147483647;
		System.out.println(i);
		
		long l =1000; // 큰타입의 변수에 작은 타입의 값을 할당하는 것은 가능 - 자동으로 데이터 타입 변환
		long longVal = 1000L;
		long longVal2 = 2147483648L;
		System.out.println(l);
		System.out.println(longVal);
		System.out.println(longVal2);
		
		float f =10.5f;
		System.out.println(f);
		
		double d = 10.5;
		System.out.println(d);
		int data;
		data=0;
		
	}
}
