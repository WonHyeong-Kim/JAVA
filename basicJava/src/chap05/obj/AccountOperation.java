package chap05.obj;

import java.util.Scanner;

public class AccountOperation {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("==========계좌정보 입력========");
		
		Account a1 = new Account();
		System.out.print("계좌번호 : ");
		a1.accountNo = key.nextInt();
		System.out.print("개설일 :");
		a1.openDate=key.nextInt();
		System.out.print("계좌종류 : ");
		a1.accountKind=key.next();
		System.out.print("잔액 : ");
		a1.blance = key.nextInt();
		a1.deal = new String[4];
		for(int i=0; i<a1.deal.length;i++) {
			a1.deal[i] = key.next();
		}
		System.out.println("계좌번호 : "+a1.accountNo);
		System.out.println("개설일 : "+a1.openDate);
		System.out.println("계좌종류 : "+a1.accountKind);
		System.out.println("잔액 : "+a1.blance);
		System.out.print("거래 : ");
		for(int i=0; i<a1.deal.length;i++) {
			System.out.print(a1.deal[i]+" ");
		}

	}

}
