package kr.s05.operation;

public class SwitchMain03 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int score;
		char grade;
		
		System.out.print("성적 입력>");
		score = input.nextInt();
		
		if(score<0 || score>100) {
			System.out.println("성적은 0~100만 입력 가능");
			System.exit(0); //프로그램 종료
		}
		
		switch(score/10) {
		case 10: // 100
			grade = 'A'; break;
		case 9: // 90 ~ 99
			grade = 'A'; break; // 수행문이 똑같으면 공유 가능 그래서 case10:
								//                           case9:
								//                             grade = 'A'가능
		case 8: // 80 ~ 89
			grade = 'B'; break;
		case 7: // 70 ~ 79
			grade = 'C'; break;
		case 6: // 60 ~ 69
			grade = 'D'; break;
		default : // <60
			grade = 'F';
			
		}
		
		System.out.println(); //아무것도 안 넣으면 단순 줄바꿈
		System.out.printf("성적 : %d%n", score);
		System.out.printf("등급 : %c%n", grade);
				
		input.close();
	}
}
