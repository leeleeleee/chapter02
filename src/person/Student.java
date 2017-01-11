package person;

public class Student extends Person{
	public Student() {
		
		System.out.println("Student() called!");
		
	}
	public Student( String name ) {
		//명시하지 않으면 기본생성자가 자동으로 호출
		//super();
		super(name);
		System.out.println("Student(String) called");

		//부모 생성자를 명시할 경우에는 반드시 맨 앞에 한다.( error )
		//super();
		
	}
	public void test() {
		//부모의public 속성 접근ㅇ
		name = "둘리";
		
		//부모의protected 속성접근 ㅇ
		height = 130;
		
		//부모의default 속성 접근 ㅇ (같은 패키지에서만)
		age = 30;
		
		//부모의 private 속성 접근 x
	//	weight = 30;
	}
}
