package chapter02;

public class GoodsApp {
	static int i;
	public static void main(String[] args) {
		Goods camera = new Goods (); // constructer
		
		//private�� �ܺο��� ����  X
		//camera.name = "nikon";
		
		//protected ���� ��Ű������ ���� ����
		camera.price= 4000000;
		
		camera.countSold = 100;
		
		camera.countStock = 50;
		

	}

}
