package paint;

public abstract class Shape { //추상 클래스
	private String color;
	
	public Shape() {
		
	}
	
	public String getColor() {
		return color;
	}
	public Shape( String color ) {
		this.color = color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//public abstract void draw(); // 추상 메소드
}
