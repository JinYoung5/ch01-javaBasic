package kr.s20.object.extention;

//부모클래스
class A{
	int x = 100;
	private int y = 200;
	
	public int getY() {
		return y;
	}
}

//자식클래스
class B extends A{
	int z = 300;
	
}
public class ExtentionMain03 {
	public static void main(String[] args) {
		B bp = new B();
		System.out.println(bp.x);
		//private 멤버 변수는 상속 관계라도 있어도 다른 클래스에서 호출은 불가
		//System.out.println(bp.y); //!private가 더 강력해서 오류. 퍼블릭한 메서드가 필요해 만들어 줘야됨(은닉화)!
								  // !public int getY() return y; 를 생성, public한 메서드 생성!
		System.out.println(bp.getY());
		System.out.println(bp.z);
	}
}
