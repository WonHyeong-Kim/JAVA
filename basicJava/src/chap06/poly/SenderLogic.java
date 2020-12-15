package chap06.poly;
public class SenderLogic {
	public void run(Sender sender) {
		System.out.println("호출");
		sender.send();
	}
}
