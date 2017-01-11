package paint;

public class Rectangle extends Shape implements Drawable{
	private int x;
	private int xy;
	private int x2;
	private int y2;
	public int getX() {
		return x;
	}
	public Rectangle() {
		super( "" );
	}
	@Override
	public void draw() {
		System.out.println("사각형을 그렸습니다.");
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getXy() {
		return xy;
	}
	public void setXy(int xy) {
		this.xy = xy;
	}
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public int getY2() {
		return y2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}

}
