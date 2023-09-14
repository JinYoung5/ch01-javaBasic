package kr.s24.object6.inter;

interface A1{
	//상수
	public static final int W = 10; // 원형
	int X = 20; //static final 생략됨
	static int Y = 30; //final 생략
	final int Z = 40; // static 생략 생략해서 사용 가능
}

public class InterMain01 {
	public static void main(String[] args) {
		//인터페이스는 객체 생성 불가능
		//A1 ap = new A1();
		
		System.out.println("W = " + A1.W);
		System.out.println("X = " + A1.X);
		System.out.println("Y = " + A1.Y);
		System.out.println("Z = " + A1.Z);
		
		//상수는 변경 불가능
		//A1.X = 100;
		
	}
}
