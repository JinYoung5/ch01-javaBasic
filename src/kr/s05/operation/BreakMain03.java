package kr.s05.operation;

public class BreakMain03 {
	public static void main(String[] args) {
		//다중반복문에서 break를 이용해 모든 반복문 빠져나가기
		
		//break; 로 만들면 하나의 {}영역만 빠져나가서 모든 for문을 출력해나감
		//break label(break exit_for)지정을 해주면 모든 for문을 출력
		
		
		
		exit_for: //레이블명 지정
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				if(j == 3)
					break exit_for; //레이블이 지정된 for문 영역을 빠져나감
				System.out.println("i= " +i+",j="+j);
				
			}
		}
	}
}
