package chapter02;

public class Goods3 {
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	//�⺻ ������
	//�⺻ �����ڴ� ���� �����ڸ� �����ϴ� ��� �ڵ����� ��������� �ʴ´�.
	public Goods3() {
		
	}
	
	public Goods3(
		String name, 
		int price,
		int countSold,
		int countStock ){
		
		this.name = name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;
		}
		
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int coutStock) {
		this.countStock = coutStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	@Override
	public String toString() {
		return "Goods3 [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold
				+ "]";
	}

	
	
}
