package kr.s09.object.instance;

public class InstanceMain {
		//클래스의 기본 구조
		//멤버변수
		int var1;
		String var2;
		
		//생성자 (생략 가능)
		public InstanceMain() {}
		
		//멤버 메서드
		public int sum(int a, int b) {
			return a + b; // 메서드에서 출구로 나오는 용어(return)
		}

		public static void main(String[] args) {
			//객체 선언 및 생성
			//자료형	(me)참조차료형 연산자(new)  생성자(InstanceMain())
			InstanceMain me = new InstanceMain();
			System.out.println("me : " + me);
			
			int result = me.sum(5, 6);
			System.out.println("int result : " + result);
			
			//반환해라 = return 값을 빼내어 활용해라
		}
		
}
