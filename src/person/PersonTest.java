package person;

public class PersonTest {

	public static void main(String[] args) {
		Student s = new Student();
		Student s2 = new Student( "둘리" );
		
		Person p = s; // Upcasting,Implicity
		Student s3 = (Student)p; //Downcasting, Explicity
		
		//
		// 레퍼런스 p로 객체의 기능을 사용하다가...
		// 자식의 메소드를 사용해야 하는 경우
		((Student)p).test();

	}

}
