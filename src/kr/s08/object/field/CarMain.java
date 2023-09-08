package kr.s08.object.field;
//같은 파일에 여러개 class 가능, 대신 객체변수로 사용하는 class는 main메서드 사용 못함
class Car{
	//멤버 변수 (지정 하고 해도 되고 지정 안해도됨)
	String company	= "현대자동차";
	String model	= "그랜저";
	String color	= "검정";
	int maxSpeed	= 350;
	int speed		= 90;
	
}

public class CarMain {
	public static void main(String[] args) {
		//객체 선언 및 생성
		Car myCar = new Car();
		
		//객체의 멤버 변수의 값 읽기
		System.out.println("제작회사	: "	+ myCar.company);
		System.out.println("모델명	: "	+ myCar.model);
		System.out.println("색깔	: "		+ myCar.color);
		System.out.println("최고 속도	: "	+ myCar.maxSpeed);
		System.out.println("현재 속도	: "	+ myCar.speed);
		System.out.println("-----------------------------");
		
		//멤버 변수의 값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 : "+ myCar.speed);
		
		
		
	}
}
