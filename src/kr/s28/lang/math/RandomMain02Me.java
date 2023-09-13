package kr.s28.lang.math;

import java.util.Random;
import java.util.Scanner;

public class RandomMain02Me {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 가위바위보 게임
		 * 
		 * [입력 예시]
		 * -------------------
		 * 메뉴>1.게임하기, 2.종료
		 * -------------------
		 * 메뉴>1
		 * 가위바위보 입력(0.가위,1.바위,2.보):
		 * 
		 * [출력 예시]
		 * -> 컴퓨터: 가위, 사람 : 바위
		 * 결과 : 사람 승 
		 */
		Scanner input = new Scanner(System.in);

		/*String[] game = {"가위","바위","보"};
		System.out.println("가위바위보 게임");
		System.out.println("-----------------------");
		System.out.println("메뉴>1.게임하기, 2.종료");
		System.out.println("-----------------------");
		System.out.print("메뉴>");
		int menu = input.nextInt();
		if(menu==1) {
			System.out.print("가위바위보 입력(0.가위,1.바위,2.보):");
		}else {
			System.out.println("종료");
			System.exit(0);
		}
		int num = input.nextInt();

		double ran = Math.random();
		int index = (int)(ran*3);
		if ((int)index==0) {
			//System.out.println("컴퓨터 : 가위");
		}else if((int)index==1) {
			//System.out.println("컴퓨터 : 바위");
		}else if((int)index==2) {
			//System.out.println("컴퓨터 : 보");
		}else {
		}
		System.out.println("컴퓨터 : "+ index, "사람 :" + num);
		if(num==index) {
			System.out.println("결과 : 무승부");
		}else if(num>index) {
			System.out.println("결과 : 사람 승");
		}else if(num<index) {
			System.out.println("결과 : 컴퓨터 승");
		}else {
		}
		
			input.close();
		*/
	}
}
