package kr.s04.operator;

public class OperatorMain13 {
	public static void main(String[] args) {
		/*
		 * 이메일 : pinos71@daum.net 로 보내기
		 * 
		 * [숙제]
		 * A전자 대리점에서는 그날 물건 판매액의 15%를 할인 해주기로 했다.
		 * 판매한 상품명과 상품의 단가와 수량을 입력해서 지불 금액을 출력하는 프로그램을 작성.
		 * (단, 출력 시에는 소수점 이하 절삭)
		 * 
		 * [입력 예시]
		 * 상품명 입력 : 냉장고
		 * 단가 입력 : 500000
		 * 판매 수량 입력 : 3
		 * 
		 * [출력 예시]
		 * 냉장고 3대 가격은 1,275,000원
		 * 
		 */
		
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("상풍명 입력:");
		String name = input.nextLine();
		
		System.out.print("단가 입력:");
		int price = input.nextInt();
		
		System.out.print("판매 수량 입력:");
		int num = input.nextInt();
		
		int result = (int)(price*num*0.85);
		//int result = price*num*85/100; -> 형변환 안시키고 정수로만하는것
		
		System.out.printf("%s %d대 가격은 %,d원", name, num, result);
		
		
		
		
		input.close();
	
		
	}
}
