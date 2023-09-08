package kr.s04.operator;

public class OperatorMain06 {
	public static void main(String[] args) {
		System.out.println("===비교(관계)연산자===");
		boolean result;
		int a = 10;
		double b = 10.5;
		
		result = a < b;
		System.out.println("a < b : " + result);
		
		result = a > b;
		System.out.println("a > b : " + result);
		
		result = a >= b; //크거나 같나
		System.out.println("a >= b :" + result);
		
		result = a <= b; //작거나 같나
		System.out.println("a <= b : " + result);
		
		result = a == b; //같은지
		System.out.println("a == b : " + result);
		
		result = a !=b; //같지 않은지
		System.out.println("a != b : " + result);
		
		
	}
}
