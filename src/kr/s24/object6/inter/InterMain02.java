package kr.s24.object6.inter;

//인터페이스
interface A2{
	//추상메서드
	public abstract void make();//원형
	void play();
}

class B2 implements A2{ //implements : 구현하다(교재,책 에는 상속이라는 단어를 많이쓰는데 구현이 더 맞는말)
	//인터페이스의 추상메서드 구현
	@Override
	public void make() {
		System.out.println("make 메서드");
	}
	@Override
	public void play() {
		System.out.println("play 메서드");
	}
}

public class InterMain02 {
	public static void main(String[] args) {
		B2 bp = new B2();
		bp.make();
		bp.play();
		
	}
}
