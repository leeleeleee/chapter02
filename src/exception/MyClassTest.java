package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass m = new MyClass();
		
		try{
			m.dangerousMethod();
		} catch (MyException e ) {
			e.printStackTrace();
		}
		
		try{
			func();
		} catch( IOException e ) {
			e.printStackTrace();
		}

	}
	
	public static void func() throws MyException {
		MyClass m = new MyClass();
		m.dangerousMethod();
	}
	
	public static void func2() throws FileNotFoundException , IOException {
		FileReader fr = new FileReader( "hello.txt" );
		int data = fr.read();
		fr.close();
	}
	
	//비추
	public static void func3() {
		try{
		FileReader fr = new FileReader( "hello.txt" );
		int data = fr.read();
		fr.close();
		}catch( Exception e ) {
			
		}
	}
}
