package chap05.array;

import java.util.Random;

public class ArrayTest02 {

	public static void main(String[] args) {
		Random[] randarr = new Random[3];
		
		System.out.println(randarr);
		System.out.println(randarr[0]);
		System.out.println(randarr[1]);
		System.out.println(randarr[2]);
		
		randarr[0] = new Random();
		randarr[1] = new Random();
		randarr[2] = new Random();
		
		System.out.println(randarr[0]);
		System.out.println(randarr[1]);
		System.out.println(randarr[2]);
		
		System.out.println(randarr[0].nextInt());
		
		
		
		
	}

}
