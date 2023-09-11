package kr.s23.object.bank;

public class BankMain {
	public static void main(String[] args) {
		//일반 계좌 생성
		BankAccount bank = new BankAccount(); 
		bank.setNumber("100-123");	//계좌번호
		bank.setPassword("1234");	//비밀번호
		bank.setName("홍글동");		//이름
		bank.setBalance(10000L);	//잔고
		
		//계좌 정보 출력
		bank.printAccount();
		//입금 하기
		bank.deposit(2000L);
		//계좌 정보 출력
		bank.printAccount();
		//출금 하기
		bank.withdraw(12000L);
		//계좌 정보 출력
		bank.printAccount();
		
		System.out.println("===========================");
		
		//마이너스 계좌 생성
		MinusAccount ma = new MinusAccount();
		ma.setNumber("123-101");
		ma.setPassword("5432");
		ma.setName("박문수");
		ma.setBalance(10000L);
		ma.setMinusLimit(1000L);
		
		//마이너스 계좌 정보 출력
		ma.printAccount();
		
		//입금 하기
		ma.deposit(10000);
		//마이너스 계좌 정보 출력
		ma.printAccount();
		
		//출금하기
		ma.withdraw(21000);
		//마이너스 계좌 정보 출력
		ma.printAccount();
	}
}
