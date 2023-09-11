package kr.s26.lang.string;

public class StringMain01 {
	public static void main(String[] args) {
		//암시적으로 객체 생성
		//암시적으로 객체를 생성할 때 문자열이 같으면 같은 객체를 공유
		String str1 = "abc";
		String str2 = "abc";
		
		//객체 비교
		if(str1 == str2) {
			System.out.println("str1과 str2는 같은 객체");
		}else {
			System.out.println("str1과 str2는 다른 객체");
		}
		
		//문자열 비교
		if(str1.equals(str2)) {
			System.out.println("str1의 내용(문자열)과 str2의 내용(문자열)이 같다");
		}else {
			System.out.println("str1의 내용(문자열)과 str2의 내용(문자열)이 다르다.");
		}
	}
}
