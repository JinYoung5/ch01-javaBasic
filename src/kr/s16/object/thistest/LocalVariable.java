package kr.s16.object.thistest;

public class LocalVariable {
	//멤버 변수 : 클래스 블럭 내에서 정의된 변수
	int b = 200;

	public LocalVariable() {
		int a = 300; //지역 변수
		int c = 500;
		System.out.println("a : " + a); //지역변수
		System.out.println("c : " + c); //지역변수
	}

	public void make() {
		//지역변수 : 메서드, 생성자, 제어문 블럭 내에서 생성된 변수, 해당 블럭이 종료되면 변수는 소멸
		int a = 100;
		System.out.println("a : " + a); //지역변수 (이클립스에서 갈색은 지역변수(메서드가 종료되면 사라짐))
		System.out.println("b : " + b); //멤버변수 (파란색은 멤버변수 (객체내에서 살아있음))
		//생성자에서 생성된 지역 변수로 생성자가 종료되면 소멸됨.
		//System.out.println("c : " + c);  
	}

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) { //제어문 블럭안의 지역 변수
			System.out.println(i); 
		}
		System.out.println("------------");
		//제어문 블럭밖에서 호출하면 지역 변수가 소멸해서 호출 불가
		//System.out.println(i); (지역변수여서 소멸되어 오류남)

		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
}
