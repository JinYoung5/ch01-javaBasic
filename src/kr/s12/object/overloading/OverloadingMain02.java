package kr.s12.object.overloading;

public class OverloadingMain02 {
	//전달되는 인자의 타입을 모두 String으로 변환해서 문자열의 길이를
	//구하는 메서드 만들기
	public void getLength(int n) {
		String s = String.valueOf(n); // int 데이터를 String 으로 변환
		getLength(s); //15번 줄의 getLength를 의미
	}
	public void getLength(float n) {
		String s = String.valueOf(n); //float 데이터를 String 으로 변환
		getLength(s); //15번 줄의 getLength를 의미
	}
	public void getLength(String s) {
		System.out.println(s + "의 길이 :" + s.length());
	}
	
	public static void main(String[] args) {
		OverloadingMain02 om = new OverloadingMain02();
		om.getLength(10000);
		om.getLength(3.14f);
		om.getLength("Hello");
	}
}
