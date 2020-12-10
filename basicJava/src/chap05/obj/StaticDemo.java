package chap05.obj;

public class StaticDemo {
	int num;
	static int staticNum;
	public StaticDemo() {
		num++;
		staticNum++;
	}
	public void display() {
		System.out.println("num="+num);
		System.out.println("staticNum="+staticNum);
	}
}
