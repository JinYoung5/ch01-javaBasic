package kr.s20.object.extention;

//부모 클래스
class Parent extends Object{ // extends objects 생략 해서 쓰임.기본적으로 생략, 자동으로 Object가 상속됨 
	int a = 100;
}

//자식 클래스
class Child extends Object{ 
	int b = 200;
}

public class ExtentionMain01 {
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println();
		System.out.println(ch.b);
	}
}
