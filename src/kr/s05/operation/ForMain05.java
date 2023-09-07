package kr.s05.operation;

public class ForMain05 {
	public static void main(String[] args) {
		for(int dan=2; dan<=9; dan++) { //dan: 구구단의 단 2 ~ 9 
			System.out.println("***" + dan + "단***");
			
			for(int i=1; i<=9; i++) {
				System.out.println(dan + "*" + i + "=" + dan*i);
				
			}
			
		}
	}
}
