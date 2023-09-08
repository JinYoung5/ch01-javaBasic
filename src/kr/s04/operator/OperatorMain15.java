package kr.s04.operator;

public class OperatorMain15 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int balance = 0;
		
		System.out.print("예금액:");
		balance += input.nextInt();//누적
		System.out.printf("잔고 : %,d원%n", balance);
		
		System.out.print("출금액:");
		balance -= input.nextInt(); //차감
		System.out.printf("잔고 : %,d원", balance);
		
		
		input.close();
		
	}
}

//대입연산자를 사용하면 깔끔해짐