package chap02;
// 기본형 데이터 타입의 형변환
public class TypeCastingTest {
	public static void main(String[] args) {
		// 1. 묵시적 형변환 - 자동형변환(큰타입의 변수에 작은 데이터를 담을경우)
		byte byteVal=10;
		short shortVal = byteVal;
		int intVal = shortVal;
		long longVal = intVal;
		float floatVal = longVal;
		double doubleVal = floatVal;
		System.out.println(doubleVal);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		char charVal = 'A';
		System.out.println(charVal);
		int data = charVal;
		//char charVal2 = data; -> error
		System.out.println(data);
		
		// 2. 명시적 형변환 - 형변환을 직접 정의해야한다.
		int intdata = 200;
		byte bytedata = (byte)intdata;
		System.out.println(bytedata);
		
		int chardata =65;
		System.out.println((char)charVal);
		
		double doubledata = 10.0/3.0;
		System.out.println(doubledata);
	}
}
