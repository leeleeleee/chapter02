package chapter02;

public class Goods3Test {

	public static void main(String[] args) {
		Goods3 g = new Goods3();
		g.setName( "nikon" );
		g.setPrice( 10000000 );
		g.setCountSold( 100 );
		g.setCountStock( 20 );
		
		//���� �ڵ� ��ſ� ���� �����ڷ� ��ü�� �����ϸ� �ʱ�ȭ 
		Goods3 g2 = new Goods3("nikon", 1000000,100, 20);

		System.out.println( g );
		System.out.println( g2 );
	}

}
