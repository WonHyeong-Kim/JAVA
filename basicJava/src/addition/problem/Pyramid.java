package addition.problem;
import java.util.Scanner;


public class Pyramid { 
	
public static void main(String[] args) { 
		
		int size = 40; 
		Scanner keyboard = new Scanner(System.in);  
		System.out.print("1 ~ 40사이의 정수를 입력하세요. : ");
		size = keyboard.nextInt();
		
		Pyramid myTriangle = new Pyramid();
		myTriangle.printPyramid(size);
		
	}
	
	public void printPyramid(int size) {
		
		if ((1<=size) && (size<=40)) {
			for (int i = 0; i < size; i++) {
				
				for (int j = size-1; j > i; j--) {
					System.out.print(" ");
				}//for
				for (int j = 0; j < (2*i+1); j++) {
					System.out.print("*");	
				}//for
				System.out.println();
			}//for(i)
			
		}//if
		else
			System.out.println("입력한 정수가 범위를 벗어났습니다.");
	}//printPyramid
}//Pyramid
