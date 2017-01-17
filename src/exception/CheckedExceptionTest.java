package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		
//		FileReader fr = new FileReader( "hello.txt" );
//		int data = fr.read();
//		fr.close();
		
		//위 코드를 사용하기 위해
		FileReader fr = null;
		try {
			fr = new FileReader( "hello.txt" );
			int data = fr.read();
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch ( IOException e ) {
				e.printStackTrace();
		} finally {
			try{
				if( fr == null ){
			fr.close();
			} catch ( IOException e ) {
				e.printStackTrace();
			}
			}
		}

	}

}
