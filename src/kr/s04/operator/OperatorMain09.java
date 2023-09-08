package kr.s04.operator;

public class OperatorMain09 {
	public static void main(String[] args) {
		System.out.println("===조건(삼항)연산자===");
		int x = 10;
		int y = -10;
		
		//			조건	  ?참값:거짓값
		int absX = x >= 0 ? x : -x;
		//          true면   x(참값)가 absX에 대입됨
		//          false면  -x(거짓값)가 absX에 대입됨
		
		int absY = y >= 0 ? y : -y;
		//         y >= 0이 true면  y가 absY에 대입됨
		//		   y >= 0이 false면 -y가 absY에 대입됨
		
		System.out.println("x=10일 때, x의 절대값은 " + absX);
		System.out.println("y=-10일 때, y의 절대값은 " + absY);
		
		
		
		
	}
}
