package kr.ac.smu.paint.main;

import kr.ac.smu.paint.shpae.Circle;
import kr.ac.smu.paint.shpae.Rectangle;
import kr.ac.smu.paint.shpae.Shape;
import paint.Drawable;
import paint.Resizable;

public class InstanceOfTest {
	public static void main( String[] args ) {
		Circle c = new Circle();
		
		System.out.println( c instanceof Circle );
		System.out.println( c instanceof Shape );
		System.out.println( c instanceof Drawable );
		
		//System.out.println( c instanceof Rectangle );
		
		Shape s = new Rectangle();
		System.out.println( s instanceof Shape );
		System.out.println( s instanceof Rectangle );
		System.out.println( s instanceof Circle );
		System.out.println( s instanceof Drawable );
		System.out.println( s instanceof Resizable );
		
		
		//System.out.println( s instanceof String );
		
		Drawable drawable = new Circle();
		System.out.println( s instanceof Drawable );
		System.out.println( s instanceof Shape );
		System.out.println( s instanceof Rectangle );
		//System.out.println( s instanceof String );
		
		
		
	}
}


