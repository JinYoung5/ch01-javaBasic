package kr.s25.object.lang;

public class ObjectMain {
	public static void main(String[] args) {
		ObjectMain om = new ObjectMain();
	
	//클래스 정보
	System.out.println(om.getClass());
	//클래스명 반환
	System.out.println(om.getClass().getName());
	//해시코드를 16진수로 변환
	System.out.println(Integer.toHexString(om.hashCode()));
	//참조값 반환
	System.out.println(om.toString());
	}
}
