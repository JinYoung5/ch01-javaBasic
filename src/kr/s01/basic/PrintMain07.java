package kr.s01.basic;
public class PrintMain07 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 유재석은 은행계좌를 가지고 있다. 계좌에 1,000원이
		 * 예금되어 있는데 오늘 325원을 송금 받아서 잔고가 1,325원이
		 * 되었다.
		 * 특별이자율은 0.3이 적용되어 내일 이자 397.5원을 받는다.
		 *
		 * 예금자, 송금되기전 잔금, 송금된 금액, 송금이후 잔금,
		 * 내일 입금될 이자를 출력하시오.
		 */
		
		System.out.printf("%s : %s%n", "예금자","유재석");
		System.out.printf("%s : %,d원%n", "송금전 잔금",1000);
		System.out.printf("%s : %d원%n", "송금된 금액",325);
		System.out.printf("%s : %,d원%n", "송금이후 잔금",1325);
		System.out.printf("%s : %.1f%n", "특별이자율",0.3);
		System.out.printf("%s : %.1f원%n", "내일 입금될 이자",397.5);
		
		
		//강사님 답
		//숫자가 있을 때 printf 가 유리
		
		System.out.println("=================");
		
		System.out.println("예금자 : 유재석");
		System.out.printf("송금되기전 잔금 : %,d원%n", 1000);
		System.out.printf("송금된 금액 : %,d원%n", 325);
		System.out.printf("송금이후 잔금 : %,d원%n", 1325);
		System.out.printf("내일 입금될 이자 : %,.1f원%n", 397.5);
	}
}
