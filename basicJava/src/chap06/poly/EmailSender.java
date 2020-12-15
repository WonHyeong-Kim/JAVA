package chap06.poly;
public class EmailSender extends Sender {
	int length;
	public EmailSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void send() {
		System.out.println(name+" - 전송이 완료(이메일로 메시지가 전송)");
		// 실제는 이메일로 메시지가 전송되는 모든 로직, 명령문등이 구현
	}
}

