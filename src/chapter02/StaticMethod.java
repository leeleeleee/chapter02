package chapter02;

public class StaticMethod {
	private int n;
	private static int m; //method area

	//instance �޼ҵ忡���� �ν��Ͻ� ���� ���� ����
	public void f1 ( int x ) {
		n = x;
	}
	
	public void f2 ( int x) {
	//	StaticMethod.m=x;
		//���ӽ����̽��� �Ǵ� Ŭ���� �̸��� Ŭ�����ȿ��� ���� ����
		m = x;
		
		//static �޼ҵ嵵 ���� ����
		StaticMethod.s1(x);
	}
	
	//static �޼ҵ忡���� �ν��Ͻ� ���� ������ �Ұ�
	public static void s1 ( int x ) {
		//n = x;
		//f2(x); //����
	}
	
	public static void s2 ( int x ) {
		m = x;
	}
	
	
}
