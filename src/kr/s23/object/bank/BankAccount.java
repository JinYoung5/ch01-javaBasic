package kr.s23.object.bank;

public class BankAccount {
	//멤버 변수
	protected String number;
	protected String password;
	protected String name;
	protected long balance;
	
	//생성자 를 만들려면 class 내용과 동일하게 작성
	public BankAccount() {
		System.out.println("계좌가 개설되었습니다.");
		
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	//입금 하기
	// public void 문에서 System.out.println("!!!"); 다음에 return은 생략되어 있다.
	public void deposit(long amount) {
		if(amount <= 0) {
			System.out.println("0이하의 금액은 입금할 수 없습니다.");
			return;//특정 조건일 때 void형 메서드를 빠져나오게 하기위해 쓰임.
		}
		balance += amount;
		System.out.println(amount + "원이 입금 되었습니다.");
	}
	
	//출금 하기
	public void withdraw(long amount) {
		if(amount <= 0) {
			System.out.println("0이하의 금액은 입금할 수 없습니다.");
			return;
		}
		if(balance < amount) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		balance -= amount;
		System.out.println(amount + "원이 출금 되었습니다.");
	}
	//잔고 확인
	public void printAccount() {
		System.out.println("--------------------");
		System.out.println("(일반)계좌번호:" + number);
		System.out.println("비밀번호 : " + password);
		System.out.println("예금주 : " + name);
		System.out.printf("계좌 잔액 : %,d원%n", balance);
		System.out.println("--------------------");
	}
	
}
