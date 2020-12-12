package chap06;

public class Account {
	private String accId;
	private long balance;
	private String ownerName;
	
	public Account(){
		
	}
	public Account(String accId, String ownerName, long balance){
		this.accId=accId;
		this.balance = balance;
		this.ownerName= ownerName;
	}
	public void deposit(long amount) {
		this.balance+=amount;
	}
	public void withdraw(long amount) {
		this.balance-=amount;
	}
	public long getBalance() {
		return balance;
	}
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
}
