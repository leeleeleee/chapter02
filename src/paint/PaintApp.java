package paint;

public class PaintApp {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
//		Shape s =rectangle;
//		Shape s1 = circle;
		draw( rectangle );
		draw( circle );
		draw( triangle );
	}
	public static void draw ( Drawable drawable ) {
		drawable.draw();
	}
//	public static void drawShape(Shape shape) {
//		shape.draw();
//	}
//	public static void drawRectangle(Rectangle rectangel) {
//		rectangel.draw();
//	}
//	public static void drawCircle(Circle circle) {
//		circle.draw();
//	}
}
