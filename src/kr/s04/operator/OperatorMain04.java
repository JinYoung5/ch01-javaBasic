package kr.s04.operator;

public class OperatorMain04 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때
		 * 학생당 몇 개를 가질 수 있고, 최종적으로 몇 개가 남는지를 구하시오.
		 * 
		 * [출력 예시]
		 * 학생 한 명이 가지는 연필수 : **
		 * 남은 연필 수 : **
		 */
		
		int 연필 = 534 , 학생 = 30;
		int a = 연필 / 학생;
		int b = 연필 % 학생;
		
		System.out.printf("학생 한 명이 가지는 연필 : %d개%n", a);
		System.out.printf("남은 연필 : %d개", b);
		
		
		int c = 534 , d = 30;
		System.out.printf("%n학생 한 명이 가지는 연필 : %d개%n", c / d);
		System.out.printf("남은 연필 : %d개%n", c % d);
		
		int e = 534 / 30;
		int f = 534 % 30;
		System.out.println("학생 한 명이 가지는 연필 : " + e);
		System.out.println("남은 연필 : " + f);
		
		//강사님 답
		int pencils = 534;
		int students = 30;
		
		//학생 한 명이 가지는 연필수
		System.out.println("학생 한 명이 가지는 연필수 : " + pencils/students);
		//남은 연필수
		System.out.println("남은 연필수 : " + pencils%students);
		
		
		
		
		
		
	}
}
