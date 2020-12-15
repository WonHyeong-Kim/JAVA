package chap06.poly;

public class DVD extends Content {
	private String subject;
	
	public DVD(String title, String subject) {
		super(title);
		this.subject = subject;
	}
	
	public void totalPrice() {
		if(subject.equals("java")) {
			setPrice(2000);
		}
		else if(subject.equals("servlet")) {
			setPrice(2500);
		}
		else if(subject.equals("spring")) {
			setPrice(3000);
		}
		else {
			setPrice(600);
		}
	}

	public String getSubject() {
		return subject;
	}

	public void setsubject(String subject) {
		this.subject = subject;
	}
	
	
}
