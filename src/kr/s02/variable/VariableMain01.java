package kr.s02.variable;

public class VariableMain01 {
	public static void main(String[] args) {
		//변수(Variable)는 값을 저장할 수 있는 메모리의 공간
		
		//변수 선언 (메모리 공간을 할당하는 것) int: 자료형 num: 변수명
		//변수를 넣을 때에는 꼭 정수만
		int num;
		
		//변수의 초기화 '='는 대입을 의미 '=='표시가 같다라는 표시
		num = 17;
		
		//변수의 값 출력
		System.out.println(num);
		System.out.println("-----------");
		
		//변수 선언, 초기화
		int number = 20;
		
		//출력
		System.out.println(number);
		
		//데이터 변경   또 int num 을 할 수 없다.
		number = 40;
		//출력
		System.out.println(number);
		System.out.println("------------");
		
		//주의사항
		//동일한 변수명으로 선언하면 오류 발생
		//int number = 30;
		
		//동일한 자료형을 사용하기 때문에 두번째 변수명 앞의 자료명은 생략함.
		int a = 10;
		int b = 20;
		//int a = 10, b = 20; 위와 동일
		int result = a + b; //변수에서 값을 호출해서 연산
		//출력
		System.out.printf("result = %d%n", result);
		/*
		 * + : 연산
		 * 숫자 + 숫자
		 * + : 연결
		 * 문자열 + 숫자 -> 문자열과 숫자를 연결해서 새로운 문자열을 만듦
		 * 숫자 + 문자열
		 * 문자열 + 문자열 동일
		 */
		System.out.println("result = " + result);
		
		//주의사항
		System.out.println("결과 : " + a + b);
		System.out.println("결과 : " + (a + b));
		//단 곱,나누기는 사칙연산 그대로
		
		//변수 선언
		int no;
		
		//변수 선언 후 출력 또는 연산하기 전에 반드시 초기화를 해야 함
		//System.out.println(no); <- 조심
		
	}
}
