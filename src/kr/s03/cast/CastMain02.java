package kr.s03.cast;

public class CastMain02 {
	public static void main(String[] args) {
		System.out.println("===명시적 형변환(강제 형변환)===");
		//더 작은 자료형으로 강등이 일어나는 형태, 정보의 손실이 발생할 수 있음.
		byte b1 = 127;
		byte b2 = 127;
		byte result = (byte)(b1 + b2);// 뒤 쪽에있는 (byte) 는 캐스트 연산자
									//자동적으로 int로 형변환된 것을 byte로 강제 형변환
									//데이터의 손실이 있음
		System.out.println("result = " + result);
		
		
		short s1 = 32767;
		short s2 = 32767;
		short result2 = (short)(s1 + s2);//자동적으로 int로 형변환된 것을 short로 강제 형변환
		System.out.println("result2 = " + result2);
		
		int in1 = 100;
		long lg1 = 200L;
							//lg1 : long -> int 강제 형변환
		int result3 = in1 + (int)lg1;
		System.out.println("result3 = " + result3);
		
		int in2 = 26;
		float ft = 10.3f;
							//ft : float -> int 강제 형변환
		int result4 = in2 + (int)ft;
		System.out.println("result4 = " + result4);

		int in3 = 3;
		float ft2 = 3.6f;
		float result5 = in3 + ft2;
		
		System.out.println("result5 = " + result5);
		
		
		
	}
}
