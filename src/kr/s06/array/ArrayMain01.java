package kr.s06.array;

public class ArrayMain01 {
	public static void main(String[] args) {
		char[] ch; 			//배열 선언   (char[] <-배열의 자료형 의미)
		ch = new char[4]; 	//배열 생성 (메모리 공간에 방이 4개있다)
	   //ㄴ배열의 주소가 저장된다
		
		//배열의 초기화
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		
		//배열의 요소 출력
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		System.out.println("---------------");
		
		//반복문을 이용한 배열의 요소 출력
		for(int i=0;i<4;i++) {
			System.out.println("ch["+i+"]:"+ch[i]);
			
		}
		
		System.out.println("---------------");
						//배열의 길이  (.을 찍으면 배열의 하위 요소를 가져와라) 
		for(int i=0 ; i<ch.length;i++ )
			System.out.println("ch["+i+"]:"+ch[i]);
		
		//배열의 선언, 생성
		int[] it = new int[6]; //int[] 는 배열의 자료형을 의미
		
		//배열의 선언, 생성(명시적 배열 생성), 초기화
		char[] ch2 = new char[] {'자','바'}; //new char[]에서 []안에는 아무것도 명시하지 않는다
		
		//배열의 선언, 생성(암시적 배열 생성), 초기화
		char[] ch3 = {'강','남','구'};
		
		System.out.println(it);
		System.out.println(ch2);
		System.out.println(ch3);
		
		
	}
}
