package chap06;

public class CheckingAccount extends Account{
	private String cardNo;
	public CheckingAccount() {
		
	}
	public CheckingAccount(String accId, String ownerName, long balance,
			String cardNo) {
		super(accId, ownerName, balance);
		this.cardNo=cardNo;
	}
	public void pay(String cardNo, long amount) {
		long balance=getBalance();
		if(this.cardNo.equals(cardNo) &
				amount<balance) {
			//setBalance(balance- amount);
			withdraw(amount);
			
		}
		else {
			System.out.println("지불이 불가능합니다.");
		}
	}
}
