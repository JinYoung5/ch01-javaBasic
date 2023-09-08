package kr.s17.object.trainning;

public class Animal {
	/*
	 * [실습]
	 * 1. 멤버 변수 : 이름(name), 나이(age), 비행 여부(fly)
	 * 2. 생성자 지정 : 인자 없는 생정자, 인자가 있는 생성자(name, age, fly)
	 * 3. set/get 지정 : 멤버 변수를 private 지정하고 public한 set/get메서드 정의
	 */
	private String name;
	private int age;
	private boolean fly;

	public Animal () {}
	public Animal (String name, int age, boolean fly) {
		//멤버변수		  지역변수
		this.name	= name;
		this.age	= age;
		this.fly	= fly;
	}
	public void setName(String name) {
		//멤버변수		지역변수
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
		
	}
	public void setFly(boolean fly) {
		this.fly = fly; 
	}
	public boolean isFly() { //boolean 탑입은 get 말고 is 명시
		return fly;
	}
}
