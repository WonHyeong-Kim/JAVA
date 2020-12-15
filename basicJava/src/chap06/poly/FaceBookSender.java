package chap06.poly;

public class FaceBookSender extends Sender{
	int length;
	public FaceBookSender(String name,int length){
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
		
	}

}
