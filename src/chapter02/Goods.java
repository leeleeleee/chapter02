package chapter02;

public class Goods {
		private String name;
		protected int price;
		public int countStock;
		
		//default ���� ����(public, protected, private �� ���� �����ڸ�  ������� ���� ���)
		int countSold;
		
		String getName () {
			return name;
		}
		
		void discount ( int percentage ) {
			price = price - price * percentage;
		}
}
