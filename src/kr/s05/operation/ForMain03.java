package kr.s05.operation;

public class ForMain03 {
	public static void main(String[] args) {
		//1부터 100까지의 합 구하기
		//sum을 지정해서 대입연산자 사용
		int sum = 0;
		
		for(int i=1;i<=100;i++) {
			//누적
			sum += i; //sum = sum + i
			
		}
		System.out.println("1부터 100까지의 합 : "+sum);
		
		System.out.println("-------------");
		
		//1부터 100까지의 범위에서 짝수의 합 구하기
		int total = 0;
		
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				total += i;
			}
		}		
				System.out.println("1부터 100까지의 짝수 합 : "+total);
				
			System.out.println("---------");	
			}
				
		}