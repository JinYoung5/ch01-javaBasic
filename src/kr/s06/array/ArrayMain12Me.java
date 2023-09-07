package kr.s06.array;

public class ArrayMain12Me {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 요소의 수를 지정하고 지정된 수로 배열을 생성해서 
		 * 해당 배열에 정수를 저장하시오.
		 * 배열에 저장된 요소를 역순으로 출력하시오.
		 * 
		 * [입력 예시]
		 * 요소수:3
		 * array[0] : 20
		 * array[1] : 10
		 * array[2] : 5
		 * 
		 * [출력 예시]
		 * 요소를 역순으로 정렬했습니다.
		 * array[0] : 5
		 * array[1] : 10
		 * array[2] : 20
		 * 
		 */
		java.util.Scanner input = new java.util.Scanner(System.in);

		
		String[] array = new String[3];
		

		System.out.print("요소수:");
		int num = input.nextInt();
		
		for(int i=0;i<num;i++) {
			System.out.print("array"+"["+ i +"]:" );
			int z = input.nextInt();
			
			System.out.println("요소를 역순으로 정렬했습니다.");
			for(int j=0; j<array.length;j++) {
				System.out.println("array"+"["+ j +"]"+ ":"+ z);
						
		}
			
		
		
		
		input.close();
		
		
		}
	}

}
