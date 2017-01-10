package chapter02;

public class GoodApp2 {

	public static void main(String[] args) {
		Goods2 goods = new Goods2();
		
	//	camera.name = "nikon";
		
		goods.setPrice( -1 );
		System.out.println( goods.getPrice() );
		
		goods.setName("Nikon");
		System.out.println( goods.getName() );
		
		Goods2 goods2 = new Goods2 ();
		System.out.println(Goods2.countOfGoods);
		
		Goods2 goods3 = new Goods2 ();
		System.out.println(Goods2.countOfGoods);
		
		Goods2 goods4 = new Goods2 ();
		System.out.println(Goods2.countOfGoods);
		
		goods4.setName( "tv" );
		goods4.setPrice( 500000 );
		goods4.showInfo();
		double discountPrice = goods4.calcDiscountPrice(0.8);
		System.out.println( discountPrice );
		
		
	//	
		//static 변수 테스트
		//System.out.println( Goods2.countOfGoods );
		
		//return 업고 파라미터도 업슨ㄴ 메소드
	
}
}
