package kr.s16.object.thistest;

public class ThisMain03{
	/*
	 * 생성자 내부에서 또 다른 생성자를 호출할 때 this()를 표시함.
	 * 
	 */
	public ThisMain03()	{
		this("바람");
	}
	public ThisMain03(int a) {
	System.out.println(String.valueOf(a)); //int -> String
	}
	public ThisMain03(String s) {
	System.out.println(s);
	}
	public static void main(String[] args) {
		ThisMain03 tm = new ThisMain03();
		ThisMain03 tm2 = new ThisMain03(3000);
		ThisMain03 tm3 = new ThisMain03("Korea");
	}
}
