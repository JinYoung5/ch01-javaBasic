package kr.s04.operator;

public class OperatorMain01 {
	public static void main(String[] args) {
		System.out.println("===증감연산자===");
		 //증가연산자
		int i = 5; //변수 할당 (변수에 5가 들어가있다.)
		 //증가연산자를 변수 앞에 명시하면 변수값을 1 증가시킨 후 증가된 값을 읽어옴
		System.out.println(++i);//6
		System.out.println("--------------");
		
		 //증가연사를 변수 뒤에 명시하면 변수값을 먼저 읽어온 후 메모리의 변수 값을 1증가시킴
		 //증가된 값을 보기 위해서는 한 번 더 호출해야 함
		System.out.println(i++);//6
		System.out.println(i);//7
		 //i++은 할당된 메모리에있는 증가된 값 6을 불러 왔지만, 메모리공간에는 7이 남아있음.
		 //메모리공간에있는 7을 불러오려면 i 를 한 번 더 출력 하면 됨.
		System.out.println("----------------");
		
		 //감소연산자
		int j = 10;
		System.out.println(--j);//9
		System.out.println("-------------");
		
		System.out.println(j--);//9
		System.out.println(j);//8
		
		
		
	}
}
