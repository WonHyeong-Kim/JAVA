package chap05.array;

public class ArgsTest {

	public static void main(String[] args) {
		System.out.println("사용자 ip"+ args[0]);
		System.out.println("사용자 port"+ args[1]);
		System.out.println(Integer.parseInt(args[2])+ Integer.parseInt(args[3]));

	}

}
