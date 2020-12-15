package chap06.exam;
public class Prob6 {
	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if(stack.isEmpty()){
			System.out.println("스택이 비어있습니다.");
		}
		
		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}
		
		if(stack.isFull()){
			System.out.println("스택이 가득 찼습니다.");
		}
		
		System.out.println("최상위 숫자 : " + stack.top());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
		for (int i = 1; i <= 10; i++) {
			int num = stack.pop();
			if(num != -1)
				System.out.println(num);
		}
	}
}

class MyStack{
	
	// 구현하시오.
	int[] arr;
	int topIdx=-1;
	public MyStack() {
		arr = new int [10];
	}
	public MyStack(int idx) {
		if(idx<0) {
			arr = new int [10];
		}
		else {
			arr = new int [idx];
		}
		
	}
	public void push(int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) {
				arr[i] = num;
				topIdx++;
				return;
			}
		}	
	}
	public boolean isEmpty() {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				return false;
			}
		}
		return true;
	}
	public boolean isFull() {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				return false;
			}
		}
		return true;
	}
	public int top() {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				if(i==0) {
					return -1;
				}
				return arr[i-1];
			}
		}
		if(arr[arr.length-1] != 0) {
			return arr[arr.length-1];
		}
		else {
			return -1;
		}
		
	}
	public int pop() {
		int top = top();
		if(topIdx ==-1) {
			return -1;
		}
		else {
			arr[topIdx]=0;
			topIdx--;
			return top;
		}
	}
}