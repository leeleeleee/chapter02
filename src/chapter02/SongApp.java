package chapter02;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Song song = new Song();
		song.setTitle("������");
		song.setArtist("������");
		song.setAlbum("Real");
		song.setComposer("�̹μ� �۰�");
		song.setTrack(3);
		song.setYear(2010);
		
		song.show();
		
		Song song2 = new Song( null, "���ϸ�", "ù��ó�� �ʿ��� ���ڴ�.", null, 0, 2016);
		song2.show();
		System.out.println(song2);
		
		Song song3 = new Song( "Beautiful", "ũ����" );
		song3.show();
	
		
		
	}

}
