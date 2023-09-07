package kr.s12.object.overloading;

public class OverloadingMain01 {
	//Method Overloading *중요* 많이 쓰임
	//Method Overloading(중복정의)는 하나의 클래스 내에서 같은 이름을
	//가지는 메서드가 여러 개 정의되는 것을 말함
	//메서드명은 동일하게 하고 인자의 타입 또는 개수, 배치된 순서가 다를 경우
	//다른 메서드로 인식함
	public void print(int n) {
		System.out.println("정수 n = " + n);
	}
	//public void print(int a) { // 충돌 같은 메서드로 인식.
	//}
	public void print(double a) { // int,double 타입을 비교해서 충돌나지 않음
		System.out.println("실수 a = " + a);
	}
	public void print(double a, long b) { //갯수를 다르게하면 충동나지 않음
		System.out.println("실수 a ="+a+",정수b = " + b);
	}
	//public void print(double a, long b) { //자료형도 똑같고 개수도 같아 충동
	//}
	public void print(long a, double b) { //개체 순서를 바꿔도 충돌 나지 않음
		System.out.println("정수 a ="+a+",실수b = "+ b);
	}
	
	public static void main(String[] args) {
		OverloadingMain01 om = new OverloadingMain01();
		om.print(20);
		om.print(10.5);
		om.print(3.7,123L);
		om.print(126L,10.2);
	}
}
