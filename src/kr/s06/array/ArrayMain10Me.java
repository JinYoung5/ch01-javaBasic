package kr.s06.array;

public class ArrayMain10Me {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 1)10,20,30,40,50을 초기값으로 갖는 1차원 배열을 test 이름으로
		 * 선언,생성,초기화 하시오.
		 * 2)반복문을 이용해서 출력하시오.
		 * 3)확장 for문을 이용해서 출력하시오.
		 * 4)인덱스3의 데이터를 100으로 변경하시오.
		 * 5)마지막 요소의 값을 200으로 변경하시오.
		 * 6)반복문을 사용하여 모든 요소의 값을 0으로 초기화 하시오.
		 * 7)홀수 인덱스에 10, 짝수 인덱스에 20 저장
		 * 8)모든 요소의 총 합과 평균(총합을 요소의 수로 나눔) 구하고
		 * 출력하시오.(sum(총합),avg(평균))
		 */
		
		System.out.println("-----1,2-----");
		//int [] test = new int[] {10,20,30,40,50}; 명시적
		int[] test = {10,20,30,40,50}; //암시적
		
		for(int i=0;i<test.length;i++) {
			System.out.println("test["+i+"]:"+ test[i]);
		}
		System.out.println("-----3-----");
		for(int num : test){
			System.out.println(num);
		}
		System.out.println("-----4,5-----");
		test[3] = 100;
		int i = 200;
		System.out.println("-----6-----");
	
		
	}
}