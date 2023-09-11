package kr.s23.object.bank;

public class BankAccount {
	//멤버 변수
	private String number;
	private String password;
	private String name;
	private long balance;
	
	//생성자 를 만들려면 class 내용과 동일하게 작성
	public BankAccount(String number, String password,String name, long balance) {
		
		this.number 	= number;
		this.password 	= password;
		this.name 		= name;
		this.balance 	= balance;
		System.out.println(this.number + " 계좌가 개설되었습니다.");
	}
	
	//입금 하기
	// public void 문에서 System.out.println("!!!"); 다음에 return은 생략되어 있다.
	public void deposite(long amount) {
		if(amount <= 0) {
			System.out.println("0이하의 금액은 입금할 수 없습니다.");
			return;//특정 조건일 때 void형 메서드를 빠져나오게 하기위해 쓰임.
		}
		balance += amount;
		System.out.println(amount + "원이 입금 되었습니다.");
	}
	
	//출금 하기
	
	
}
