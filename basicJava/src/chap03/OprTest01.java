package chap03;

public class OprTest01 {
	public static void main(String[] args) {
		System.out.println("10%3=>"+10%3);;
		double data =(double)10/3;
		System.out.println(data);
		
		int x=0;
		int y=0;
		
		x=5;
		y=++x;
		System.out.println("x="+x+",y="+y);
		
		x=5;
		y=x++;
		System.out.println("x="+x+",y="+y);
		
		x=5;
		y=--x;
		System.out.println("x="+x+",y="+y);
		
		x=5;
		y=x--;
		System.out.println("x="+x+",y="+y);
	}

}
