package kr.s28.lang.math;

import java.util.Random;


public class RandomMain03Me {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 로또 프로그램 제작
		 * 길이 6인 int형 배열 생성하고 1~45 숫자 범위로 난수를 구함.
		 * 중복되지 않은 6개의 숫자를 생성해서 배열에 저장하고 출력하시오.
		 * 난수 생성 : Math.random() 또는 Random 클래스의 nextInt() 메서드 사용
		 */

		int [] num = new int[7];
		for (int i=0;i<num.length;i++) {

			num[i] = (int)(Math.random()*45)+1;

			for(int j=0; j<1;j++) {
				while(num[i] == num[j]) {
					num[j] = (int)(Math.random()*45)+1;
				}
			}
		}
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
