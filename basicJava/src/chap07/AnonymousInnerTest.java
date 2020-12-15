package chap07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

interface Super{
	void display();
}
class Sub implements Super{

	@Override
	public void display() {
		System.out.println("display");
		
	}
	
}

public class AnonymousInnerTest {
	public static void main(String[] args) {
		Super obj = new Sub();
		obj.display();
		obj.display();
		Super obj3 = new Sub();
		Super obj2 = new Super() { // 클래스명 implements Super
								   // Super의 하위 클래스를 바로 정의해서 생성 
			public void display() {
				System.out.println("익명 이너클래스");
			}
		};
		obj2.display();
		
		JFrame f = new JFrame("익명이너클래스 테스트");
		JButton btn = new JButton("누르세요");
		//이벤트 연결 - 익명클래스를 클래스 안에 바로 정의하고 생성해서 메소드의 매개변수로 전달한 예.
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("이너클래스로 연결한 이벤트");
			}
		});
		f.add(btn);
		f.setSize(300,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
