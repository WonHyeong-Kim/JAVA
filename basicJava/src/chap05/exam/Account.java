package chap05.exam;

public class Account {
	private String accNo;
	private int balance;
	public void save(int amount) {
		System.out.println(this.accNo+" 계좌에 "+amount+"만원이 입급되었습니다.");
		this.balance +=amount;
	}
	public void deposit(int amount) {
		System.out.println(this.accNo+" 계좌에 "+amount+"만원이 출금되었습니다.");
		this.balance -=amount;
	}
	public void setBalance(int balance) {
		this.balance=balance;
	}
	public int getBalance() {
		return this.balance;
	}
	public void setAccNo(String accNo) {
		System.out.println(accNo+" 계좌가 개설되었습니다.");
		this.accNo=accNo;
	}
	public String getAccNo() {
		return this.accNo;
	}
}
