package chapter02;

public class Goods2 {
	public static int countOfGoods;
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	//기본 생성자
	public Goods2() {
		System.out.println("기본 생성자 호출");
		Goods2.countOfGoods++;
	}
	
	public void setName( String name ) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if( price < 0 ) {
			price = 0;
		}
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	public void showInfo() {// no return, no parameter
		System.out.println( "name=" + name + "," + "price=" + price + "," + "countStock=" + countStock + "," + "countSold=" + countSold );
	
}
	public double calcDiscountPrice (double rate) {
		double discountPrice = price * rate;
		return discountPrice;
	}

}
