package kr.s05.operation;

public class IfMain09 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 
		 * 생년월일을 입력하고 만 나이를 출력하는 프로그램을 작성하시오.
		 * 만 나이 = (현재 연도 - 태어난 연도) - (생일이 지났으면 0, 생일이 지나지 않았으면 1)
		 *
		 * [입력 예시]
		 * 출생연도 입력:2000
		 * 월 입력:3
		 * 일 입력:12
		 * 
		 * [출력 예시]
		 * 만 나이는 23
		 * 
		 */

		java.util.Scanner input = new java.util.Scanner(System.in);

		//현재 날짜 정보
		int thisYear 	= 2023;
		int thisMonth	= 9;
		int thisDate	= 4;

		System.out.print("출생연도 입력:");
		int Year = input.nextInt();
		System.out.print("월 입력:");
		int Month = input.nextInt();
		System.out.print("일 입력:");
		int Date = input.nextInt();

		//현재 연도와 태어난 연도
		int age = thisYear - Year;
		//현재 월과 태어난 월을 비교
		if(thisMonth < Month) {
			age--;
		}else if (thisMonth == Month && thisDate < Date) {
			//현재 월과 태어난 월이 같으면 일 비교 ex) 4 < 30
			age--;
		}else {
			//생일이 지난 경우이기 때문에 age의 변동 없음. 그래서 
			//else를 명시할 필요가 없다.
			System.out.println("~~~~~~~~~");
		}
		System.out.printf("만 나이는 %d%n",age);
		input.close();
	}
}
