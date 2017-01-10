package chapter02;

public class StaticMethod {
	private int n;
	private static int m; //method area

	//instance 메소드에서는 인스턴스 변수 접근 가능
	public void f1 ( int x ) {
		n = x;
	}
	
	public void f2 ( int x) {
	//	StaticMethod.m=x;
		//네임스페이스가 되는 클래스 이름은 클래스안에서 생략 가능
		m = x;
		
		//static 메소드도 접근 가능
		StaticMethod.s1(x);
	}
	
	//static 메소드에서는 인스턴스 변수 접근이 불가
	public static void s1 ( int x ) {
		//n = x;
		//f2(x); //에러
	}
	
	public static void s2 ( int x ) {
		m = x;
	}
	
	
}
