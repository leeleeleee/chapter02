package exception;

public class ExceptionTest02 {

	public static void main(String[] args) {
		try{
			int a = 0;
			int b = 100 / a;
			System.out.println( "some code" );
			return;// 실행 안됨
		} catch( Exception ex ) {
			System.out.println( "예외 발생-" + ex );
		} finally {
			System.out.println("some code2");
		}
		
		System.out.println( "some code3" );
		
	}

}
