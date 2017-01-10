package chapter02;

public class GoodsApp {
	static int i;
	public static void main(String[] args) {
		Goods camera = new Goods (); // constructer
		
		//private는 외부에서 접근  X
		//camera.name = "nikon";
		
		//protected 같은 패키지에서 접근 가능
		camera.price= 4000000;
		
		camera.countSold = 100;
		
		camera.countStock = 50;
		

	}

}
