package paint;

public class Circle extends Shape implements Drawable{
	private int x;
	private int y;
	private int radius;
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그렸습니다.");
	}
	
}
