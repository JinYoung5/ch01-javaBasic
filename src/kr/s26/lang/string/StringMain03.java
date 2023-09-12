package kr.s26.lang.string;

public class StringMain03 {
	public static void main(String[] args) {
		String s1 	= "  aBa  ";
		String s2 	= "abc";
		int a 		= 100;
		String msg	= null; // null - 객체 생성이 되지않아 주소가 없음
		
		//문자열을 대문자로 반환
		msg = s1.toUpperCase();
		System.out.println("msg:"+msg);
		
		//문자열을 소문자로 반환
		msg = s1.toLowerCase();
		System.out.println("msg:"+msg);
		
		//old 문자를 new 문자로 대체
		msg = s1.replace("aB", "b");
		System.out.println("msg:"+msg);
		
		//앞 뒤 공백 제거
		msg = s1.trim();
		System.out.println("msg:"+msg);
		
		//지정한 문자열이 포함되어 있으면 true 반환 포함 되어있지않으면 false 반환
		boolean f = s1.contains("aB");
		System.out.println("f:"+f);
		
		//지정한 문자열로 시작할 경우 true 반환
		f = s2.startsWith("ab");
		System.out.println("f:"+f);
	}
}
