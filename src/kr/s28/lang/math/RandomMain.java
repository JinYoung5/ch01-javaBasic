package kr.s28.lang.math;

public class RandomMain {
	public static void main(String[] args) {
		String[] gift = {"스마트폰","TV","냉장고","꽝!"};
					 //		0	    1     2    3
		double ran = Math.random(); //0.0 ~ 1.0미만의 난수 발생
		System.out.println("발생한 난수 : " + ran);
		
		int index = (int)(ran*46);
		System.out.println("정수로 변환한 난수 : " + index);
		System.out.println("오늘의 선물 : " + gift[index]);
	}
}
