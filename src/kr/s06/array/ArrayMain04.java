package kr.s06.array;

public class ArrayMain04 {
	public static void main(String[] args) {
		//배열 선언, 생성, 초기화
		int[] score = {79,88,91,33,100,55,95};
		
		int max = score[0]; //배열의 첫번째 값으로 최댓값을 초기화
		int min = score[0];	//배열의 첫번째 값으로 최솟값을 초기화
		
		for(int i=1;i<score.length;i++) {
			//최댓값 구하기
			if(score[i] > max) {
				max = score[i]; //최댓값이 변동
			}
			//최솟값 구하기
			if(score[i] < min) {
				min = score[i]; //최솟값이 변동
			}
		}
		//최댓값, 최솟값 출력
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	}
}
