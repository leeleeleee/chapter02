package paintpackage;

public class PaintApp {

	public static void main(String[] args) {
		
		Point pt1 = new Point();
		pt1.setX( 100 );
		pt1.setY( 200 );
		drawPoint(pt1);
		
		//overload 
		Point pt2 = new Point(50, 100);
		drawPoint(pt2);
		
		pt1.show( false );
		pt2.show( false );
		pt2.show();
		
		Point pt3 = new ColorPoint( 500, 500, "red" );
		pt3.show();
		drawPoint(pt3);
	}
	
	public static void drawPoint( Point point ) {
		point.show();
	}
}
